package PA12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;

public class Merger {
	
    private static Object deserialize(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(filePath);
        ObjectInputStream in = new ObjectInputStream(file);
        Object obj = in.readObject();
        in.close();
        file.close();
        return obj;
    }
    
	// Add the merge method here
    
    public static void merge() {
    	EmployeeSalary[] salaries = null;
    	EmployeePerformance[] performances = null;
    	try {
			salaries = (EmployeeSalary[]) deserialize(FileNames.EMPLOYEE_SALARY);
			performances = (EmployeePerformance[]) deserialize(FileNames.EMPLOYEE_PERFORMANCE);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
    	
    	Comparator<Employee> sortByID = (o1, o2) -> o1.id.compareTo(o2.id);
    	Arrays.sort(salaries, sortByID);
    	Arrays.sort(performances, sortByID);
    	
    	for(int i = 0; i < salaries.length; i++) {
    		System.out.println(String.format("%s, %-14s, %2d, %5d", salaries[i].id, salaries[i].name, performances[i].rating, salaries[i].salary));
    	}

    }
}
