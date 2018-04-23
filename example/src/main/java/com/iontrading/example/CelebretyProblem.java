package com.iontrading.example;

public class CelebretyProblem {
	private int[][] Matrix = { { 0, 0, 1, 0 }, { 0, 0, 0, 1 },
			{ 0, 0, 0, 0 }, { 0, 0, 1, 0 } };

	public static void main(String[] args) {

		CelebretyProblem c = new CelebretyProblem();

		System.out.println(c.findCB(4));

	}

	private int findCB(int n) {
		int a = 0;
		int b = n - 1;
		while (a < b) {
			if (knows(a, b))
				a--;
			else
				b--;
		}

		for (int i = 0; i < n; i++) {
			if (i != a && knows(a, i) || !knows(i, a))
				return -1;
		}
		return a;
	}

	private boolean knows(int a, int b) {
		return  (Matrix[a][b]==1)? true:false;
	}
}
