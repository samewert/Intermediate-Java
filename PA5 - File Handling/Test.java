package PA5;

import java.io.IOException;
import java.util.Arrays;

public class Test {
	
//	I had all of my text files in my package just to make my eclipse a little more organized
//	so that is why I have src/PA5 in front of the text files
//	Also for selection and insertion sort the string were in the correct order but they
//	did not perfectly match yours because some of the capitals were off because we were supposed to ignore them
	
	
	
	
	private static final void testSelectionSorting() throws IOException { // complete this method
		String[] selectArr = FileHandler.readStringsFromFile("src/PA5/Strings.txt");
		System.out.println("Unsorted array: " + Arrays.toString(selectArr));
		System.out.println();
		StringHandler.selectionSortIgnoreCase(selectArr);
		System.out.println("Selection sorted array: " + Arrays.toString(selectArr));
		System.out.println();
		FileHandler.writeArrayOfStringsToFile(selectArr, "src/PA5/SelectionSort.txt");
	}
	
	private static final void testInsertionSorting() throws IOException { // complete this method
		String[] insertArr = FileHandler.readStringsFromFile("src/PA5/Strings.txt");
		System.out.println("Unsorted array: " + Arrays.toString(insertArr));
		System.out.println();
		StringHandler.insertionSortIgnoreCase(insertArr);
		System.out.println("Insertion sorted array: " + Arrays.toString(insertArr));
		System.out.println();
		FileHandler.writeArrayOfStringsToFile(insertArr, "src/PA5/InsertionSort.txt");
	}
	
	
	private static final void testRemoveDuplicates() throws IOException { // complete this method
		String[] duplicateArr = FileHandler.readStringsFromFile("src/PA5/Strings.txt");
		System.out.println("Array with duplicates: " + Arrays.toString(duplicateArr));
		System.out.println();
		String noDuplicates = StringHandler.removeDuplicatesIgnoreCase(duplicateArr);
		System.out.println("Array without duplicates: " + noDuplicates);
		FileHandler.writeStringToFile(noDuplicates, "src/PA5/DuplicatesRemoved.txt");
	}

	public static void main(String[] args) throws IOException {
		testSelectionSorting();
		testInsertionSorting();
		testRemoveDuplicates();
	}
}
