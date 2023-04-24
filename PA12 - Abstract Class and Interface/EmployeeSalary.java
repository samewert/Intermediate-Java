package PA12;

public class EmployeeSalary extends Employee {

	private static final long serialVersionUID = -185949876313619835L;
	public int salary;

	public EmployeeSalary(String id, String name, int salary) {
		super(id, name);
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s, %d", super.toString(), salary);
	}
}
