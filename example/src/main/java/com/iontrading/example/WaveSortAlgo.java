package com.iontrading.example;

public class WaveSortAlgo {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		WaveSortAlgo waveSort = new WaveSortAlgo();
		waveSort.waveSort(a, 8);
		for (int i = 0; i < 9; i++)
			System.out.print(" " + a[i]);
	}

	private void waveSort(int[] a, int n) {
		for (int i = 0; i < n; i += 2) {
			if (i > 0 && a[i - 1] > a[i])
				swap(a, i, i - 1);

			if (i < n && a[i + 1] > a[i])
				swap(a, i, i + 1);
		}
	}
	private void swap(int[] a, int i, int j) {

		int t = a[i];
		a[i] = a[j];
		a[j] = t;

	}

}
