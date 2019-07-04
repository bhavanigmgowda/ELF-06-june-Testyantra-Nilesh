package com.tyss.javaprogram.methodreference;

public class CalculateFact {
    int factorial(int i)
    {  int fact =1;
       for (int j =1; j <=i; j++) {
    	   
		  fact=fact*j;
	} 
       return fact;
    }
}
