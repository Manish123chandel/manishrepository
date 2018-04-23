package com.iontrading.example;

public class findKthElement {

	public int findKElement(int[] a, int n, int k) {
		int diff = 0;
		int count = k;

		for (int i = 0; i < n - 1; i++) {
			if (!((a[i] + 1) == a[i + 1])) {
				diff += a[i + 1] - a[i] - 1;

				if (diff >= k)
					return a[i] + count;
				else
					count-=diff;

			}
		}

		return -1;

	}

	public static void main(String[] args) {
		findKthElement obj = new findKthElement();
		int[] a = new int[]{2,3,10,13,14};
		int n=a.length;
		int k=7;
		System.out.println(obj.findKElement(a, n, k));
	}

}
