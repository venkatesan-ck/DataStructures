package com.venky.misc;

import java.util.Stack;

/**
 * The Class NumWords.
 */
public class NumWords {

	/** The Constant words. */
	private static final String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine" };

	/** The Constant places. */
	private static final String[] places = { "", "", "Hundred", "Thousand", "", "Lakh", "", "Crore" };

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		printInWords(23512345);
	}

	/**
	 * Prints the number in words.
	 *
	 * @param num
	 *            the num
	 */
	private static void printInWords(long num) {
		Stack<String> stack = new Stack<>();

		int i = 0;
		while (num > 0) {
			stack.push(words[(int) (num % 10)]);
			num /= 10;
			i++;
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " " + places[--i] + " ");
		}
		System.out.println();
	}
}
