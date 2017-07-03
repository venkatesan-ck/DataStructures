package com.venky.misc;

/**
 * The Class PascalTriangle.
 */
public class PascalTriangle {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		pascalTriangle(5);
	}

	/**
	 * Pascal triangle.
	 *
	 * @param rows
	 *            the rows
	 */
	private static void pascalTriangle(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int k = rows; k > i; k--) {
				System.out.print(" ");
			}
			int k = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(k + " ");
				k = k * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
