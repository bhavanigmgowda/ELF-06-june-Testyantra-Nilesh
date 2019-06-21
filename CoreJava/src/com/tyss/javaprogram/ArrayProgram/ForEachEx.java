package com.tyss.javaprogram.ArrayProgram;

public class ForEachEx {
   public static void main(String[] args) {
	 int a[]= {5,4,1,2,3};
	 double b[]= {5.0,5.5,6.5};
	 for (int i : a) {
		System.out.print(i);
	}
	 System.out.println();
	 for (double d : b) {
		System.out.print(d);
	}
}
}
