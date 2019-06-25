package com.tyss.javaprogram.assignmentone;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int sum=0;
		int n=0;
		while(num!=0)
		{
			n=num%10;
			sum=sum+fact(n);
			num=num=num/10;
		}
		System.out.println(sum);
	}

	private static int fact(int n) 
	{    int fact=1;
		for (int i =1; i <=n; i++) 
		{
		   	fact=fact*i;
		}
		
		return fact;
	}  
}
