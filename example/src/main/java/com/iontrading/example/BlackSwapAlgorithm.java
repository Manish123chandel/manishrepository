package com.iontrading.example;

public class BlackSwapAlgorithm {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		BlackSwapAlgorithm BSA = new BlackSwapAlgorithm();
		BSA.rotateArray(a, 3, 7);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private void rotateArray(int[] a, int d, int n) {
		int i = d;
		int j = n - d;
		while (i != j) {
			if (i < j) {
				swap(a, d - i, d + j - i, i);
				j-=i;
			}
			else
			{
				swap(a, d-i, d, j);
				i-=j;
			}
		}
		swap(a, d-i, d, i);

	}

	private void swap(int[] a, int fi, int si, int d) {
		for (int i = 0; i < d; i++) {
			int t = a[fi + i];
			a[fi + i] = a[si + i];
			a[si + i] = t;

		}

	}

}
