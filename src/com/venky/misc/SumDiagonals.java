package com.venky.misc;

/**
 * The Class SumDiagonals.
 */
public class SumDiagonals {

	/** The Constant matrix. */
	private static final int[][] matrix = { 
			{ 1, 2, 3 }, 
			{ 4, 5, 6 }, 
			{ 7, 8, 9 } 
		};

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Main diagonal sum " + mDiagSum());
		System.out.println("Off diagonal sum " + oDiagSum());
	}

	/**
	 * Main diagonal sum.
	 *
	 * @return the sum
	 */
	private static int mDiagSum() {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					sum += matrix[i][j];
				}
			}
		}
		return sum;
	}

	/**
	 * Off diagonal sum.
	 *
	 * @return the sum
	 */
	private static int oDiagSum() {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i + j + 1== matrix.length) {
					sum += matrix[i][j];
				}
			}
		}
		return sum;
	}
}
