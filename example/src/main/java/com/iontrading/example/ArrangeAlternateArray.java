package com.iontrading.example;


public class ArrangeAlternateArray {

	public static void main(String[] args) {
		int[] a = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		ArrangeAlternateArray aa = new ArrangeAlternateArray();
		aa.Alternate(a, 8);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}


	private void Alternate(int[] a, int n) {
		int i = -1;
		for (int j = 0; j < n; j++) {
			if (a[j] < 0) {
				i++;
				int t = a[j];
				a[j] = a[i];
				a[i] = t;

			}
		}

		int pos = i + 1;
		int neg = 0;
		while (neg < pos && pos < n && a[neg] < 0) {
			int t = a[pos];
			a[pos] = a[neg];
			a[neg] = t;
			pos++;
			neg += 2;
		}

	}

}
