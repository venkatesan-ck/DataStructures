package com.venky.search;

/**
 * The Class BinarySearch.
 */
public class BinarySearch {

	/**
	 * Search.
	 *
	 * @param <T>
	 *            the generic type
	 * @param data
	 *            the data
	 * @param key
	 *            the key
	 * @return the int
	 */
	public static <T extends Comparable<T>> int search(T[] data, T key) {
		return bsearch(data, key, 0, data.length);
	}

	/*
	 * Recursive bsearch.
	 *
	 * @param <T> the generic type
	 * 
	 * @param data the data array
	 * 
	 * @param key the key
	 * 
	 * @param lo the lo
	 * 
	 * @param hi the hi
	 * 
	 * @return the position of element if found, -1 otherwise
	 */
	private static <T extends Comparable<T>> int bsearch(T[] data, T key, int lo, int hi) {
		if (lo < hi) {
			int mid = (lo + hi) / 2;
			int status = key.compareTo(data[mid]);
			if (status == 0) { // Found
				return mid;
			} else if (status < 0) { // Search in left sublist
				return bsearch(data, key, lo, mid);
			} else { // Search in right sublist
				return bsearch(data, key, mid + 1, hi);
			}
		} else {
			return -1;
		}
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// Sorted list is a must
		Integer[] data = { 1, 22, 33, 44, 555, 666, 7777 };
		int index = BinarySearch.search(data, 44);
		if (index != -1) {
			System.out.println("Found element at position " + index);
		} else {
			System.out.println("Element not found");
		}
	}
}
