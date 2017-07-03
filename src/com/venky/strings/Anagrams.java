package com.venky.strings;

/**
 * The Class Anagrams.
 */
public class Anagrams {

	/**
	 * Prints the anagrams.
	 *
	 * @param str
	 *            the str
	 */
	public static void printAnagrams(String str) {
		recPrintAnagrams("", str);
	}

	/*
	 * Recursively print anagrams.
	 *
	 * @param prefix the prefix
	 * 
	 * @param str the str
	 */
	private static void recPrintAnagrams(String prefix, String str) {
		int n = str.length();
		if (n == 0) { // String is empty
			System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) { // Cut and add characters to prefix
				recPrintAnagrams(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		printAnagrams("Cat");
	}
}
