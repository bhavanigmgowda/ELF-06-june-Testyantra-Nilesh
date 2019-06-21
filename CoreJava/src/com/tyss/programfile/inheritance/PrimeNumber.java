package com.tyss.programfile.inheritance;

public class PrimeNumber {
  public static void main(String[] args) {
         int a=9;
          int count=0;
         for (int i =2; i <=a/2; i++) 
         {
			 if(a%i==0)
			 {
				 count++;
				 break;
			 }
			
		}
         if(count==0)
		 {
			 System.out.println("It is prime number");
		 }
		 else
		 {
			 System.out.println("not a prime  number");
		 }
 }
}
