package com.tyss.javapogram.basicexample;

public class Factorial {
       
	public static void main(String[] args) {
		int n=5;
		int res=fact(n);
		System.out.println(res+" factorial of given number"); 
	}
	static int fact(int n) 
	{  int fact=1;
		for (int i =1; i <=n; i++) 
		{
			fact=fact*i;
		}
		return fact;
	}
}
