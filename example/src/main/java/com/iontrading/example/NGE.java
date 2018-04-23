package com.iontrading.example;

import java.util.Stack;

public class NGE {

public static void main(String[] args) {
	int[] a= new int[]{11,13,2,32};
	findNGE(a,a.length);
}

private static void findNGE(int[] a, int length) {
	Stack<Integer> s = new Stack<Integer>();
	
	int current = s.push(a[0]);
	s.push(current);
	for(int i=1;i<length;i++)
	{
		int next = a[i];
		
		if(!s.isEmpty())
		{
			int element = s.pop();
			while(element< next)
			{
				System.out.println(element + " ---> " + next);
				
			if(s.isEmpty())	
				break;
			element = s.pop();
			
			}
			
			if(element > next)
			{
				s.push(element);
			}
		}
		
		s.push(next);
	}
	
	
}

}
