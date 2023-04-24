package PA13;


import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
	
	private static final String FILE_PATH = "src/PA13/students.txt";

	static <T> void printList(List<T> list) {
		for (T e : list)
			System.out.println(e.toString());
	}

	static <T, X> void printMap(Map<T, X> map) {
		for (T e : map.keySet())
			System.out.println(e + ": " + map.get(e));
	}

	private static void collectionsTester() throws FileNotFoundException, ParseException {
		ArrayList<Student> students = FileReader.readStudents(FILE_PATH);
		System.out.println("*** Students ***\n");
		printList(students);

		StatisticsReporter.groupStudentsByMajorAndThenSortByGPA(students);
		System.out.println("\n*** Grouping students by major and then sorting based on GPA ***\n");
		printList(students);

		Student eldest = StatisticsReporter.findYoungestStudent(students);
		System.out.println("\nYoungest Student: " + eldest);
		System.out.println();

		System.out.println("*** Studens with GPA in [1.5, 3.00] ***\n");
		List<Student> studentsByGPA = StatisticsReporter.findStudentsByGPARange(students, 1.5, 3.00);
		printList(studentsByGPA);
		System.out.println();

		System.out.println("*** Studens with GPA in [2.89, 3.87] ***\n");
		studentsByGPA = StatisticsReporter.findStudentsByGPARange(students, 2.89, 3.87);
		printList(studentsByGPA);
		System.out.println();

		System.out.println("*** Studens with GPA in [3.89, 4.00] ***\n");
		studentsByGPA = StatisticsReporter.findStudentsByGPARange(students, 3.89, 4.00);
		printList(studentsByGPA);
		System.out.println();
		
		System.out.println("*** Students Grouped by Major ***\n");
		Map<String, List<Student>> studentsGroupedByMajor = StatisticsReporter.groupStudentsByMajor(students);
		printMap(studentsGroupedByMajor);

		System.out.println("\n*** Average Student GPA Grouped by Major ***\n");
		Map<String, Double> studentsAvgGPAGroupedByMajor = StatisticsReporter.averageGPAGroupedByMajor(students);
		printMap(studentsAvgGPAGroupedByMajor);

		System.out.println("\n*** Number of Students Grouped by Major With Minimum GPA 2.5 ***\n");
		Map<String, Long> studentCountsGroupedByMajor = StatisticsReporter.countingStudentsAboveMinimumGPAGroupedByMajor(students, 2.5);
		printMap(studentCountsGroupedByMajor);

		System.out.println("\n*** Number of Students Grouped by Major With Minimum GPA 3.0 ***\n");
		studentCountsGroupedByMajor = StatisticsReporter.countingStudentsAboveMinimumGPAGroupedByMajor(students, 3.5);
		printMap(studentCountsGroupedByMajor);

		System.out.println("\n*** Replace ECON with ECONOMICS ***\n");
		StatisticsReporter.changeMajorName(students, "ECON", "ECONOMICS");
		printList(students);

		System.out.println("\n*** Remove Undecided Students ***\n");
		StatisticsReporter.deleteStudentsWithNoMajor(students);
		printList(students);
	}

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		collectionsTester();
	}
}
