package com.venky.sort;

public class MSort {
	public static void msort(int array[]) {
		int len = array.length;
		if (len > 1) {
			int mid = len/2;
			int left[] = subArray(array, 0, mid);
			int right[] = subArray(array, mid, len - mid);
			msort(left);
			msort(right);

			int i = 0, j = 0, k = 0;
			while (i < left.length && j < right.length) {
				if (left[i] < right[j]) {
					array[k++] = left[i++];
				} else {
					array[k++] = right[j++];
				}
			}
			while (i < left.length) {
				array[k++] = left[i++];
			}
			while (j < right.length) {
				array[k++] = right[j++];
			}
		}
	}

	private static int[] subArray(int[] array, int start, int size) {
		int sub[] = new int[size];
		System.arraycopy(array, start, sub, 0, size);
		return sub;
	}

	public static void main(String args[]) {
		int array[] = {5,2,3,7,6,1,2,5,6,8};
		msort(array);
		for (int num : array) {
			System.out.println(num);
		}
	}
}
