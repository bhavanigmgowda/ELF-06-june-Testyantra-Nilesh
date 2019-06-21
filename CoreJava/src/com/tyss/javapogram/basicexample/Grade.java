package com.tyss.javapogram.basicexample;

public class Grade {
	public static void main(String[] args) {
		double percent=60.6;

		if(percent>60)
		{
			System.out.println("you get first Division");
		}
		else if(percent>50)
		{
			System.out.println("you get second division");
		}
		else if(percent>40)
		{
			System.out.println("you get third division");
		}
		else
		{
			System.out.println(" you are fail");
		}
	}
}
