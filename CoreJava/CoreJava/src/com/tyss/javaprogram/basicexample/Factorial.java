package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class Factorial {
       
	public static void main(String[] args) {
		int n=5;
		int res=fact(n);
		log.info(res+" factorial of given number"); 
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
