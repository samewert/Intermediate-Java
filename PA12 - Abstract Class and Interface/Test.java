package PA12;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("***Serialize Performances***\n");
		Serializer.serializePerformances();
		System.out.println("\n***Serialize Salaries***\n");
		Serializer.serializeSalaries();
		System.out.println("\n*** Merged Results ***\n");
		Merger.merge();
	}
}
