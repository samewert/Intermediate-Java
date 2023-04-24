package PA10;

public class BinarySearch {

	public static int binarySearch(String[] strings, String key) { // complete this method
		String firstString = strings[0];
		String lastString = strings[strings.length - 1];
		
		if(0 >= firstString.compareTo(lastString)) {
			return binarySearchForward(strings, 0, strings.length - 1, key);
		}
		return binarySearchReverse(strings, 0, strings.length - 1, key);
	}

	private static int binarySearchForward(String[] strings, int left, int right, String key) { // complete this method
		if(left <= right) {
			int middle = (left + right) / 2;
			if(key.equals(strings[middle])) {
				return middle;
			}
			if(0 > key.compareTo(strings[middle])) {
				return binarySearchForward(strings, left, middle - 1, key);
			}
			return binarySearchForward(strings, middle + 1, right, key);
		} 
		return -1;
	}

	private static int binarySearchReverse(String[] strings, int left, int right, String key) { // complete this method
		if(left <= right) {
			int middle = (left + right) / 2;
			if(key.equals(strings[middle])) {
				return middle;
			}
			if(0 < key.compareTo(strings[middle])) {
				return binarySearchReverse(strings, left, middle - 1, key);
			}
			return binarySearchReverse(strings, middle + 1, right, key);
		} 
		return -1;
	}
}
