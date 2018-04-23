package com.iontrading.example;

public class FindDifferenceOfSetExists {

	public static void main(String[] args) {
		if(checkSetExists(4,5))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean checkSetExists(int i, int j) {

		int t= i*(i+1)/2 +j;
		return t%2==0;
		
		
	}
	
}
