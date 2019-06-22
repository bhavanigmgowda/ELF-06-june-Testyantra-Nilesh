package com.tyss.javaprogram.assignment;

public class Pattern6 {
   public static void main(String[] args) {
	  for (int i = 0; i <=10; i++) {
		for (int j =0; j <=10; j++) {
			if(i==j||i+j==10-1||i==0||j==0||i==10||j==10)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" "); 
			}
			
		}
		System.out.println();
	}
} 
 
   
}
