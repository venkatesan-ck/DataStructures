package com.venky.sort;

public class QSort {
	public static void qsort(int array[]) {
		sort(array, 0, array.length-1);
	}

	private static void sort(int array[], int low, int high) {
		if (low < high) {
	        int p = partition(array, low, high);
	        sort(array, low, p - 1);
	        sort(array, p + 1, high);
    	}
	}

	private static int partition(int array[], int low, int high) {
		int p = array[low];

		int l = low + 1;
		int u = high;

		while (true) {
			while (l <= u && array[l] <= p) l++;
			while (array[u] >=p && u >= l) u--;

			if (u < l) {
				break;
			} else {
				swap(array, l, u);
			}
		}

		swap(array, low, u);
		return u;
	}

	private static void swap(int array[], int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}

	public static void main(String args[]) {
		int array[] = {5,2,3,7,6,1,2,5,6,8};
		qsort(array);
		for (int num : array) {
			System.out.println(num);
		}
	}
}
