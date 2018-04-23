package com.iontrading.example;

public class ModifiedBinarySearch {

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 6, 7, 1, 2 };
		ModifiedBinarySearch MB = new ModifiedBinarySearch();
		System.out.println(MB.BinarySearch(a, 0, 6, 1));
	}

	private int BinarySearch(int[] a, int l, int h, int key) {
		int low = l;
		int high = h;
		int mid = (l + h) / 2;
		if (a[mid] == key)
			return mid;

		if (a[low] <= a[mid]) {

			if (key <= a[mid] && key >= a[low])
				return BinarySearch(a, low, mid, key);
			return BinarySearch(a, mid + 1, high, key);
		}

		if (key >= a[mid] && key <= a[high])
			return BinarySearch(a, mid + 1, high, key);
		else
			return BinarySearch(a, low, mid - 1, key);

	}

}
