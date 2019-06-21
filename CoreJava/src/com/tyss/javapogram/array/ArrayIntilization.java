package com.tyss.javapogram.array;

public class ArrayIntilization {
   public static void main(String[] args) {
	 int[] a= {1,2,3,4};
	 
	 for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	 
	 System.out.println("\n");
	 
	 for (int i = a.length-1; i>=0; i--) {
		System.out.println(a[i]);
	}
	 
	 char ch[]= {'a','b','c','d'};
	 for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
	}
	 
	 String name[]= {"nil","ronak"};
	 for (int i = 0; i < name.length; i++) {
		System.out.println(name[i]);
	} 
}
}
