package com.venky.misc;

/**
 * The Class Towers. Simulate a towers of hanoi problem.
 */
public class Towers {

	/**
	 * Recursively Move.
	 *
	 * @param from
	 *            the from peg
	 * @param to
	 *            the to peg
	 * @param using
	 *            the using peg
	 * @param n
	 *            the number of discs
	 */
	public static void move(char from, char to, char using, int n) {
		if (n > 0) {
			move(from, using, to, n - 1);
			System.out.println("Move disc " + n + " from " + from + " to " + to);
			move(using, to, from, n - 1);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// Move 5 discs from A to B using C
		move('A', 'B', 'C', 5);
	}
}
