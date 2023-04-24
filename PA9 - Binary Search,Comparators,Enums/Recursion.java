package PA9; 

public class Recursion {

	public static int tribonacci(int n) { // complete this method
		if(n <= 1) {
			return 1;
		} else if( n == 2) {
			return 2;
		} else {
			return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
		}
	}

	public static boolean isPowerOf2(int n) { // complete this method
		if(n == 1) {
			return true;
		} else if(n % 2 == 1) {
			return false;
		} else {
			return isPowerOf2(n / 2);
		}
	}

	public static int countEvenDigits(int n) { // complete this method
		if(n < 10) {
			if(n % 2 == 0) {
				return 1;
			}
			return 0;
		} else {
			if(n % 2 == 0) {
				return 1 + countEvenDigits(n / 10);
			}
			return countEvenDigits(n / 10);
		}
	}

	public static int sumPosIntegersDivk(int n, int k) { // complete this method
		if(n < k) {
			return 0;
		} else {
			if(n % k == 0) {
				return n + sumPosIntegersDivk(n - k, k);
			} else {
			return sumPosIntegersDivk(n - n % k, k);
			}
		}
	}

	private static boolean searchArrayHelper(int[] A, int k, int key) { // complete this method
		if(k == 0) {
			return false;
		}
		return (A[k - 1] == key) ? true : searchArrayHelper(A, k - 1, key); 
	}

	public static boolean searchArray(int[] A, int key) { // complete this method
		return searchArrayHelper(A, A.length, key);
	}
	

	public static int determinant(int[][] matrix) { // complete this method
		if(matrix.length == 1) {
			return matrix[0][0];
		} else if(matrix.length == 2) {
			return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
		} else {
			int det = 0;
			int[][] cofactor = new int[matrix.length - 1][matrix[0].length - 1];
			for(int c = 0; c < matrix.length; c++) {
//				Is there any way to copy to cofactor with less for-loops?
				for(int row = 1; row < matrix.length; row++) {
					for(int col = 0, cofactcol = 0; col < matrix.length; col++, cofactcol++) {
						if(col != c) {
							cofactor[row - 1][cofactcol] = matrix[row][col];
						} else {
							cofactcol--;
						}
					}
				}
				if(c % 2 == 1) {
					det -= determinant(cofactor) * matrix[0][c];
				} else {
					det += determinant(cofactor) * matrix[0][c];
				}			
			}
			return det;
		}
	}
	
	
}
