package PA8;

public class Array2d {

	public static void shiftRowsDown(int[][] jagged) { // complete this method
		for(int r = jagged.length - 1; r > 0; r--) {
			int[] temp = jagged[r];
			jagged[r] = jagged[r - 1];
			jagged[r - 1] = temp;
		}
    }
    
    private static int[] add(int[] arr1, int[] arr2) { // complete this method
    	int length1 = arr1.length;
    	int length2 = arr2.length;
    	int[] combinedArr = new int[Math.max(length1, length2)];
    	
/* 		
  		Which is easier to read/Better practice to do?
    	for(int i = 0; i < arr1.length; i++) {
    					or
    	int length1 = arr1.length;
    	for(int i = 0; i < length1; i++) {
*/
    	
    	for(int i = 0; i < length1; i++) {
    		combinedArr[i] += arr1[i];
    	}
    	
    	for(int i = 0; i < length2; i++) {
    		combinedArr[i] += arr2[i];
    	}
    	return combinedArr;
    }

	public static int[][] add(int[][] jagged1, int[][] jagged2) { // complete this method
		
		int smallerLength = Math.min(jagged1.length, jagged2.length);
		int largerLength = Math.max(jagged1.length, jagged2.length);
		int[][] largerArr = (largerLength == jagged1.length) ? jagged1 : jagged2;
		int[][] combinedJagged = new int[largerLength][];
		
		for(int i = 0; i < smallerLength; i++) {
			combinedJagged[i] = add(jagged1[i], jagged2[i]);
		}

		for(int i = smallerLength; i < largerLength; i++) {
			combinedJagged[i] = new int[largerArr[i].length];
			combinedJagged[i] = largerArr[i];
		}
		return combinedJagged;	
	}

	private static boolean verifySquare(int[][] A) { // complete this method
		int r = A.length;
		for(int i = 0; i < r; i++) {
			int c = A[i].length;
			if(r != c) 
				return false;
		}
		return true;
	}

	public static boolean isOrthogonal(int[][] A) { // complete this method
		if(!verifySquare(A)) 
			return false;
		
		int rc = A.length;
		int[][] B = new int[rc][rc];
		
		for(int r = 0; r < rc; r++) {
			for(int c = 0; c < rc; c++) {
				B[r][c] = A[r][c];
			}
		}
		
		transpose(B);
		int[][] M = multiply(A, B);
		
		for(int r = 0; r < rc; r++) {
			for(int c = 0; c < rc; c++) {
				if(r == c) {
					if(M[r][c] != 1)
						return false;
				} else {
					if(M[r][c] != 0)
						return false;
				}
			}
		}
		return true;
	}

	private static void transpose(int[][] A) {
		for (int r = 0; r < A.length; r++)
			for (int c = r+1; c < A.length; c++) {
				int temp = A[r][c];
				A[r][c] = A[c][r];
				A[c][r] = temp;
			}
	}

	private static int[][] multiply(int[][] A, int[][] B) {
		int n = A.length;
		int[][] M = new int[n][n];
		for (int r = 0; r < n; r++)
			for (int c = 0; c < n; c++)
				for (int k = 0; k < n; k++)
					M[r][c] += A[r][k] * B[k][c];
		return M;
	}
}
