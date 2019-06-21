package com.tyss.javaprogram.pattern;

public class Pattern1 {
        
	public static void main(String[] args) {
		int ele=1;
		for (int i = 1; i <=7; i++) {
			for (int j =1; j <=ele; j++) {
				System.out.print("*");
				
				
			}
			if(i<=7/2)
			{
				ele=++ele;
			}
			else
			{
				ele=--ele;
			}	
			
			System.out.println();
		}
	}

}
