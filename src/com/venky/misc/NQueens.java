package com.venky.misc;

import java.util.Arrays;
import static java.lang.Math.abs;

/**
 * The Class NQueens.
 */
public class NQueens {

	/** The Constant SIZE. */
	private static final int SIZE = 6;

	/** The result. */
	private static int result[] = new int[SIZE];

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		placeQueens(0);
	}

	/**
	 * Place queens.
	 *
	 * @param row
	 *            the row
	 */
	private static void placeQueens(int row) {
		for (int i = 0; i < SIZE; i++) {
			if (canPlace(row, i)) {
				result[row] = i;
				if (row == SIZE - 1) {
					printQueens();
				}
				placeQueens(row + 1);
			}
		}
	}

	/**
	 * Can place.
	 *
	 * @param row
	 *            the row
	 * @param col
	 *            the col
	 * @return true, if successful
	 */
	private static boolean canPlace(int row, int col) {
		for (int i = 0; i < row; i++) {
			if (result[i] == col || abs(i - row) == abs(result[i] - col)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Prints the queens.
	 */
	private static void printQueens() {
		System.out.println(Arrays.toString(result));
		for (int i = 0; i < SIZE; i++) {
			System.out.print("| ");
			for (int j = 0; j < SIZE; j++) {
				System.out.print((result[j] == i ? "Q" : " ") + " | ");
			}
			System.out.println();
		}
	}
}
