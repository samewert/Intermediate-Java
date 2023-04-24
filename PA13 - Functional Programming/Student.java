package PA13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	public String name;
	public Date dateOfBirth;
	public double GPA;
	public String major;

	public Student() {

	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public double getGPA() {
		return GPA;
	}

	public String getMajor() {
		return major;
	}

	public String toString() {
		return String.format("(%s %s %.2f %s)", name, new SimpleDateFormat("MM/dd/yyyy").format(dateOfBirth), GPA, major);
	}
}
