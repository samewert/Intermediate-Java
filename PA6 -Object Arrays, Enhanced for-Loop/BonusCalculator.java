package PA6;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BonusCalculator{
	
	public final static Employee[] readEmployees(String filepath) {
		FileReader reader = null;
		try {
			reader = new FileReader(filepath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return null;
		}
		Scanner scan = new Scanner(reader);
		scan.useDelimiter(",|\\n");
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/PA6/error.csv");
		} catch (IOException e1) {
			e1.printStackTrace();
			scan.close();
			return null;
		}
		BufferedWriter bw = new BufferedWriter(writer);
		int numEmployees = scan.nextInt();
		Employee[] employees = new Employee[numEmployees];
		scan.nextLine(); //***************
		scan.nextLine(); //Is this a correct way to skip to the line with the employees?
		try {
			bw.write("Employee ID,Error Code");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		for(int i = 0; i < numEmployees; i++) {
			Employee emp = new Employee();
			String id = "";
			try {
				id = scan.next();
				String name = scan.next();
				String birthDate = scan.next();
				String joiningDate = scan.next();
				double salary = scan.nextDouble();
				emp.setEmployeeID(id);
				emp.setName(name);
				emp.setDateOfBirth(birthDate);
				emp.setDateOfJoining(joiningDate);
				emp.setSalary(salary);
			} catch(Exception e) {
				emp = null;
				try {
					bw.write("\n");
					bw.write(id);
					bw.write(",");
					bw.write(e.toString());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			} finally {
				employees[i] = emp;
				if(scan.hasNextLine()) {
					scan.nextLine();
				}
			}
		}		
		scan.close();
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return employees;
	}
	
	public final static Bonus[] computeBonuses(Employee[] employees) {
		Bonus[] bonuses = new Bonus[employees.length];
		for(int i = 0; i < bonuses.length; i++) {
			double bonus;
			if(employees[i] == null) {
				bonuses[i] = null;
			} else {
				double totTime = employees[i].getEmploymentDuration();
				if(totTime < 5) {
					bonus = employees[i].getSalary() * .02;
				} else if(totTime < 10) {
					bonus = employees[i].getSalary() * .04;
				} else if(totTime < 20) {
					bonus = employees[i].getSalary() * .06;
				} else{
					bonus = employees[i].getSalary() * .10;
				}
				Bonus b = new Bonus(employees[i], bonus);
				bonuses[i] = b;
			}
		}
		return bonuses;
	}
	
	public final static void writeBonuses(Bonus[] bonuses, String outputFile) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(outputFile);
		} catch(IOException e) {
			e.printStackTrace();
			return;
		}
		BufferedWriter bw = new BufferedWriter(writer);
		try {
			bw.write("Employee ID,Employee Name,Employment Duration,Salary,Bonus");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < bonuses.length; i++) {
			if(bonuses[i] != null) {
				try {
					bw.write("\n");
					bw.write(bonuses[i].getEmployee().getEmployeeID());
					bw.write(",");
					bw.write(bonuses[i].getEmployee().getName());
					bw.write(",");
					bw.write(String.valueOf(String.format("%.2f", bonuses[i].getEmployee().getEmploymentDuration())));
					bw.write(" years");
					bw.write(",");
					bw.write("$");
					bw.write(String.valueOf(bonuses[i].getEmployee().getSalary()));
					bw.write(",");
					bw.write("$");
					bw.write(String.valueOf(bonuses[i].getBonus()));
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}			
	}	
}