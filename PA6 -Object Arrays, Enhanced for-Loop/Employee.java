package PA6;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Employee {

	private String employeeID;
	private String name;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private double salary;

	public final void setEmployeeID(final String employeeID) throws Exception { // complete this method
		String[] arr = employeeID.split("-");
		if(arr.length == 2 && arr[0].length() == 3 && arr[1].length() == 5) {
			this.employeeID = employeeID;
		} else {
			throw new Exception("Incorrect Employee ID Format");
		}
	}

	public final void setDateOfBirth(final String dateOfBirth) throws Exception { // complete this method
		Date date = DateFormat.getFormattedDate(dateOfBirth);
		if(date.after(DateFormat.getTodaysDate())) {
			throw new Exception("Date of birth is in future");
		} else {
			this.dateOfBirth = date;
		}
	}

	public final void setDateOfJoining(final String dateOfJoining) throws Exception { // complete this method
		Date date = DateFormat.getFormattedDate(dateOfJoining);
		if(date.after(DateFormat.getTodaysDate())) {
			throw new Exception("Date of joining is in future");
		} else if(date.before(this.dateOfBirth)) {
			throw new Exception("Date of joining is before date of birth");
		} else {
			this.dateOfJoining = date;
		}
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final void setSalary(final double salary) {
		this.salary = salary;
	}

	public final String getEmployeeID() {
		return employeeID;
	}

	public final String getName() {
		return name;
	}

	public final Date getDateOfBirth() {
		return dateOfBirth;
	}

	public final Date getDateOfJoining() {
		return dateOfJoining;
	}

	public final double getSalary() {
		return salary;
	}

	public final double getEmploymentDuration() {
		long diffInMillies = 0;
		try {
			diffInMillies = DateFormat.getTodaysDate().getTime() - dateOfJoining.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		return diff / 365.00;
	}
}
