package PA13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StatisticsReporter {
	// add the methods here
	
	public static ArrayList<Student> groupStudentsByMajorAndThenSortByGPA(ArrayList<Student> studentList) {
		Comparator<Student> groupByMajorSortByGPA = (o1, o2) -> o1.major.compareTo(o2.major) != 0 ? o1.major.compareTo(o2.major) : o1.GPA - o2.GPA < 0 ? -1 : 1 ;
		Collections.sort(studentList, groupByMajorSortByGPA);
		return studentList;
	}
	
	public static Student findYoungestStudent(ArrayList<Student> studentList) {
		Comparator<Student> groupByYoungest =  (o1, o2) -> o2.dateOfBirth.compareTo(o1.dateOfBirth);
		return Collections.min(studentList, groupByYoungest);
	}
	
	public static List<Student> findStudentsByGPARange(ArrayList<Student> studentList, double minGPA, double maxGPA) {
		Stream<Student> studentListAsStream = studentList.stream();
		Stream<Student> filteredStream = studentListAsStream.filter(s -> s.GPA <= maxGPA && s.GPA >= minGPA);
		return filteredStream.collect(Collectors.toList());
	}
	
	public static Map<String, List<Student>> groupStudentsByMajor(ArrayList<Student> studentList) {
		Stream<Student> studentListAsStream = studentList.stream();
		Map<String, List<Student>> studentsByMajor = studentListAsStream.collect(Collectors.groupingBy(Student::getMajor));
		return studentsByMajor;
	}
	
	public static Map<String, Double> averageGPAGroupedByMajor(ArrayList<Student> studentList) {
		Map<String, Double> groupedMajorAverageGPA = studentList.stream().collect(Collectors.groupingBy(Student::getMajor, Collectors.averagingDouble(Student::getGPA)));
		return groupedMajorAverageGPA;
	}
	
	public static Map<String, Long> countingStudentsAboveMinimumGPAGroupedByMajor(ArrayList<Student> studentList, double minGPA) {
		Stream<Student> studentListAsStream = studentList.stream().filter(s -> s.GPA >= minGPA);
		Map<String, Long> studentsAboveGPA = studentListAsStream.collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));
		return studentsAboveGPA;
	}
	
	public static ArrayList<Student> changeMajorName(ArrayList<Student> studentList, String oldMajor, String newMajor) {
		Consumer<Student> change = s -> s.major = s.major.equals(oldMajor)? newMajor : s.major;
//		{
//			s.major = s.major.equals(oldMajor) ? newMajor : s.major;
//		}; 
		studentList.forEach(change);
		return studentList;
	}
	
	public static ArrayList<Student> deleteStudentsWithNoMajor(ArrayList<Student> studentList) {
		studentList.removeIf(s -> s.major.equals("UNDECIDED"));
		return studentList;
	}
}
