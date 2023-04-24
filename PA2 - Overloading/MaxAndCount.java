package PA2;

public class MaxAndCount{
	
	private final int[] array;
	
	public MaxAndCount(final int[] a) {
		this.array = a;
	}
	
	public final int findMax(final int left, final int right) {
		if(left < 0 || right >= array.length || left > right) {
			return Integer.MIN_VALUE;
		}
		int maxIndex = left;
		for(int i = left + 1; i <= right; i++) {
			if(array[i] > array[maxIndex]) {
				maxIndex = i;
			}
		}
		return array[maxIndex];
	}
	
	public final int findMax() {
		return findMax(0, array.length - 1);
	}
	
	public final int countKey(final int left, final int right, final int key) {
		if(left < 0 || right >= array.length || left > right) {
			return -1;
		}
		int count = 0;
		for(int i = left; i <= right; i++) {
			if(array[i] == key) {
				count++;
			}
		}
		return count;
	}
	
	public final int countKey(final int key) {
		return countKey(0, array.length - 1, key);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}