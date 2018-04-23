package com.iontrading.example;

public class MinimumElementSearchInRotationalArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		MinimumElementSearchInRotationalArray obj = new MinimumElementSearchInRotationalArray();
		System.out.println(obj.ModifiedBinarySearch(a, 0, 6));
	}

	private int ModifiedBinarySearch(int[] a, int low, int high) {

		if (low == high)
			return a[low];

		int mid = (low + high) / 2;
		if (low < mid && a[mid] < a[mid - 1])
			return a[mid];

		if (mid < high && a[mid] > a[mid + 1])
			return a[mid + 1];

		if (a[high] > a[mid])
			return ModifiedBinarySearch(a, low, mid - 1);
		return ModifiedBinarySearch(a, mid + 1, high);

	}

}
