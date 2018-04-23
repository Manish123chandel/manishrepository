package com.iontrading.example;

public class PairOfElement {

public static void main(String[] args) {
	int[] a = {10,20,30,40,50,1,2,3,4,5};
	System.out.println("Pair exist : "+ Findpair(a,50,10));
	
}

private static String Findpair(int[] a, int sum, int n) {
	int i;
	for(i=0;i<n-1;i++)
	{
		if(a[i]>a[i+1])
		{
			break;
		}
	}
	int l = (i+1)%n;
	int r = i;
	while(l!=r)
	{
		if(a[l]+a[r]==sum)
			return "Yes";
		
		if(a[l]+a[r]<sum)
		{
			l=(l+1)%n;
		}
		else
			r=(n+r-1)%n;
	}
	
	
	return "No";
}
}
