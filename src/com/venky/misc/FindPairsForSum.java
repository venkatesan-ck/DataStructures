package com.venky.misc;

import java.util.HashSet;

/**
 * The Class FindPairsForSum.
 */
public class FindPairsForSum {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		findPairs(arr, 7);
		findTriplets(arr, 7);
	}

	/**
	 * Find pairs.
	 *
	 * @param arr
	 *            the arr
	 * @param sum
	 *            the sum
	 */
	private static void findPairs(int[] arr, int sum) {
		HashSet<Integer> set = new HashSet<>(arr.length);

		for (int num : arr) {
			int value = sum - num;
			if (set.contains(value)) {
				System.out.println(value + ", " + num);
			} else {
				set.add(num);
			}
		}
	}

	/**
	 * Find triplets.
	 *
	 * @param arr
	 *            the arr
	 * @param sum
	 *            the sum
	 */
	private static void findTriplets(int[] arr, int sum) {
		HashSet<Integer> set = new HashSet<>(arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int value = sum - arr[i] - arr[j];
				if (set.contains(value) && arr[i] != arr[j]) {
					System.out.println(value + ", " + arr[i] + ", " + arr[j]);
				} else {
					set.add(arr[i] + arr[j]);
				}
			}
		}
	}
}
