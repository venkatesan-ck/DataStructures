package com.venky.sort;

/**
 * The Class SelectionSort.
 */
public class SelectionSort {

	/**
	 * Sort.
	 *
	 * @param <T>
	 *            the generic type
	 * @param a
	 *            the array
	 */
	public static <T extends Comparable<T>> void sort(T[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			// Find minimum from i + 1 till n
			int min = minimum(a, i); 
			
			// Swap it with ith value
			T t = a[min];
			a[min] = a[i];
			a[i] = t;
		}
	}

	/*
	 * Minimum.
	 *
	 * @param <T> the generic type
	 * 
	 * @param a the array
	 * 
	 * @param i the index
	 * 
	 * @return the minimum value index from i + 1 to length
	 */
	private static <T extends Comparable<T>> int minimum(T[] a, int i) {
		int min = i;
		int n = a.length;
		for (int j = i + 1; j < n; j++) {
			if (a[j].compareTo(a[min]) < 0) {
				min = j;
			}
		}
		return min;
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Integer[] data = { 5, 3, 4, 2, 1 };
		SelectionSort.sort(data);

		for (int i : data) {
			System.out.println(i);
		}
	}

}
