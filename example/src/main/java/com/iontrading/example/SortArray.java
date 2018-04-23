package com.iontrading.example;

public class SortArray {

	private void SortIt(int[] a, int n) {

		for (int i = 0; i < n; i++) {
			while (i != a[i] - 1) {
				swap(a, i, a[i] - 1);
			}
		}

	}

	private void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void main(String[] args) {
		int[] a = { 8, 5, 4, 2, 7, 3, 1, 6 };
		int n = a.length;
		SortArray sa = new SortArray();
		sa.SortIt(a, n);
		for (int i = 0; i < n; i++)
			System.out.print(" " + a[i]);
	}

}
