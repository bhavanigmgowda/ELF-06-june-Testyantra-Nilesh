package com.tyss.javaprogram.lamda;

  interface Sum{
	int add(int a,int b);  
}


public class Adding {
   public static void main(String[] args) {
	 Sum m=(a,b)-> a+b;
	 
	 int i=m.add(5, 6);
	 System.out.println(i);
}
}
