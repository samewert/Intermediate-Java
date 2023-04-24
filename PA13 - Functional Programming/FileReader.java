package PA13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

	public static ArrayList<Student> readStudents(String studentFilePath) throws FileNotFoundException, ParseException {
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner scan = new Scanner(new FileInputStream(studentFilePath));

		while (scan.hasNext()) {
			Student newStudent = new Student();
			newStudent.name = scan.next();
			newStudent.dateOfBirth = new SimpleDateFormat("MM/dd/yyyy").parse(scan.next());
			newStudent.GPA = scan.nextDouble();
			newStudent.major = scan.next();
			students.add(newStudent);
		}
		scan.close();
		return students;
	}
}
