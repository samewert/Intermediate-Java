package PA5;

public class StringHandler{
	
	public final static void selectionSortIgnoreCase(final String[] arr) {
			for(int i = 0; i < arr.length; i++) {
				int minIndex = i;
				for(int j = i + 1; j < arr.length; j++) {
					String x = arr[j].toLowerCase();
					String y = arr[minIndex].toLowerCase();
					if(x.compareTo(y) < 0) {
						minIndex = j;
					}	
				}
				if(minIndex != i) {
					String temp = arr[minIndex];
					arr[minIndex] = arr[i];
					arr[i] = temp;
				}
			}
		}
	
	public final static void insertionSortIgnoreCase(final String[] arr) {
		for(int i= 1 ; i < arr.length; i++){
			String temp = arr[i]; 
			int j=i;
			while(j > 0 && temp.toLowerCase().compareTo(arr[j - 1].toLowerCase()) < 0 ){
				arr[j] =arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	public final static String removeDuplicatesIgnoreCase(final String[] arr) {
		String[] a = arr;
		selectionSortIgnoreCase(a);
		StringBuilder output = new StringBuilder("");
		output.append("[");
		output.append(a[0].toLowerCase());
		for(int i = 1; i < a.length; i++) {
			if(!a[i].toLowerCase().equals(a[i-1].toLowerCase())) {
				output.append(", ");
				output.append(a[i].toLowerCase());
			}
		}
		output.append("]");
		return output.toString(); //unsure if this is correct because directions say to make 
//		3 public static void methods and the direction for this method state to return the 
//		StringBuilder but I returned String for the test class
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
