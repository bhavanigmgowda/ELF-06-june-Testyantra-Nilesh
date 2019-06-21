package com.tyss.javaprogram.jspaider;

public class Pattern {
	public static void main(String[] args) {
         
		for (int i = 1; i<=7; i++) 
		{
			for (int j =i; j <=7/2; j++) {
                  
                  {
                	  System.out.print("*");
                  }
                  
                  for (int j2 =7/2; j2>=i; j2--) {
					System.out.print("*");
				}
                
			}
			  System.out.println("");
		}
	} 

}
