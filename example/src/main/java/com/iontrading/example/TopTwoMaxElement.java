package com.iontrading.example;

public class TopTwoMaxElement {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 5, 3, 7, 8, 4, 12 };
		findMaxElement(a, a.length);
	}

	private static void findMaxElement(int[] a, int length) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				min = max;
				max = a[i];
			} else if (min < a[i]) {
				min = a[i];
			}
		}
		System.out.println(max + " " + min);
	}
}
