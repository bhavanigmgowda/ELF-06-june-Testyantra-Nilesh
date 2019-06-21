package com.tyss.javaprogram.overloading;

public class Phone {
	void call()
	{
		System.out.println("phone");
	}
    
}
 class MiPhone extends Phone
 {
	 void call()
	 {
		 System.out.println("thank you brother");
	 }
 }
 
 class Iphone extends Phone
    {
	       void call()
	       {
	    	   System.out.println(" i love you");
	       }
    }