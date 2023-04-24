package PA6;

public class Test {

	public static void main(String[] args) {
		BonusCalculator.readEmployees("src/PA6/fileDoesNotExist.txt");
		Employee[] employees = BonusCalculator.readEmployees("src/PA6/employee.csv");
		Bonus[] bonuses = BonusCalculator.computeBonuses(employees);
		BonusCalculator.writeBonuses(bonuses, "src/PA6/bonus.csv");
	}
}
