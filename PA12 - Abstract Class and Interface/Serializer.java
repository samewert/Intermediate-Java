package PA12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;

public class Serializer {
	
	// Add the 2 methods here
	
	public static void serializeSalaries() {
		EmployeeSalary[] salaries = new EmployeeSalary[EmployeeData.EMPLOYEE_IDS.length];
		for(int i = 0; i < EmployeeData.EMPLOYEE_IDS.length; i++) {
			salaries[i] = new EmployeeSalary(EmployeeData.EMPLOYEE_IDS[i], EmployeeData.EMPLOYEE_NAMES[i], EmployeeData.EMPLOYEE_SALARIES[i]);
		}
		
		Arrays.sort(salaries, new Comparator<EmployeeSalary>() {
			@Override
			public int compare(EmployeeSalary first, EmployeeSalary second) {
				if(first.salary < second.salary) {
					return -1;
				}
				if(first.salary > second.salary) {
					return 1;
				}
				return 0;
			}
		});
		
		for(EmployeeSalary e : salaries) {
			System.out.println(e.toString());
		}
		
		try {
			serialize(salaries, FileNames.EMPLOYEE_SALARY);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void serializePerformances() {
		EmployeePerformance[] performances = new EmployeePerformance[EmployeeData.EMPLOYEE_IDS.length];
		for(int i = 0; i < EmployeeData.EMPLOYEE_IDS.length; i++) {
			performances[i] = new EmployeePerformance(EmployeeData.EMPLOYEE_IDS[i], EmployeeData.EMPLOYEE_NAMES[i], EmployeeData.EMPLOYEE_RATINGS[i]);
		}
		
		Arrays.sort(performances, new Comparator<EmployeePerformance>() {
			@Override
			public int compare(EmployeePerformance first, EmployeePerformance second) {
				if(first.rating < second.rating) {
					return -1;
				}
				if(first.rating > second.rating) {
					return 1;
				}
				return 0;
			}
		});
		
		for(EmployeePerformance e : performances) {
			System.out.println(e.toString());
		}
		
		try {
			serialize(performances, FileNames.EMPLOYEE_PERFORMANCE);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
    
    private static void serialize(Object object, String fileName) throws IOException {
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(object);
        out.close();
        file.close();
    }
}
