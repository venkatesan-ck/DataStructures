package com.venky.search;

/**
 * The Class SequentialSearch.
 */
public class SequentialSearch {

	/**
	 * Search.
	 *
	 * @param <T>
	 *            the generic type
	 * @param data
	 *            the data array
	 * @param key
	 *            the key
	 * @return the position if found, -1 otherwise
	 */
	public static <T extends Comparable<T>> int search(T[] data, T key) {
		int position = -1;
		for (int i = 0; i < data.length; i++) {
			if (key.compareTo(data[i]) == 0) {
				position = i;
				break;
			}
		}
		return position;
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Integer[] data = { 5, 2, 3, 1, 4 };
		int index = SequentialSearch.search(data, 1);
		if (index != -1) {
			System.out.println("Found element at position " + index);
		} else {
			System.out.println("Element not found");
		}
	}
}
