package com.tyss.javaprogram.lamda;

   interface factorial
   {
	   int fact(int a);
   }

public class FactorialDemo {
     public static void main(String[] args) {
		 factorial f=a->{
			    int k=1;
			    for (int i =1; i <=a; i++) 
			    {
				     k=k*i;	
				}
			    return k;
		 };
		 
		 int facto=f.fact(5);
		 System.out.println(facto);
	}
}
