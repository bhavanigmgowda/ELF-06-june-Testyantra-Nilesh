package com.tyss.javaprogram.ArrayProgram;

public class CopyArray {
  public static void main(String[] args) {

	  int a[]= {5,3,2,1,4};
	  int b[]=new int [a.length];
	  for (int i = 0; i < a.length; i++) {
		 
		  b[i]=a[i];
	}
	  
	  for (int i : b) {
		System.out.print(" "+i);
	}
	  System.out.println();
	  for (int i : a) 
	  {
		System.out.print(" "+i);
	}
}
}
