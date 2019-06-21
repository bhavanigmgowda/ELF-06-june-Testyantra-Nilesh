package com.tyss.javapogram.basicexample;

public class Add {
   public static void main(String[] args) {
	 int a=5,b=15;
	 
	 int res=add(a,b);
	 int pro=product(a,b);
	 System.out.println(res+" add");
	 System.out.println(pro+" product"); 
	 
}
   static int add(int a,int b)
   {
	   int c=a+b;
	   return c;
   }
   static int product(int a,int b)
   {
	    int c;
	   return (c=a*b);
   }
}
