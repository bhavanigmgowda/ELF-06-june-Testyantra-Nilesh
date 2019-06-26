package com.tyss.javaprogram.assignmentone;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int sum=0;
		int pro=1;		
		while(number!=0)
		{
			int n=number%10;
			sum=sum+n;
			pro=pro*n;
			number=number/10;
		}
		System.out.println("sum ="+sum);
		System.out.println("pro ="+pro);
		System.out.println("special ="+(sum+pro));
	}
    
    
}
