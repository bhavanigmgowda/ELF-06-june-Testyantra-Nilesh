package com.tyss.javaprogram.pattern;

public class Pattern7 {
	public static void main(String[] args) {
   	 int space=7/2,ele=1;
		for (int i =1; i <=7; i++) {
		   for (int j = 1; j <space; j++) {
			  System.out.print(" ");
		}
		   for (int j = 1; j <=ele; j++) {
			System.out.print("*");
		}
		   System.out.println();
		   if(i<7/2)
		   {
			   ele=ele+2;
			   space--;
		   }
		   else
		   {
			   ele=ele-2;
			   space++;
		   }
		}
		
	}
}
