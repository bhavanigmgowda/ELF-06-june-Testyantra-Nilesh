package com.tyss.programfile.inheritance;

public class Father {
       void bike()
       {
    	   System.out.println("simple bike");
       }
       
       
}
   class Son extends Father
   {
	   @Override
	void bike() {
		System.out.println("modified bike");
	}
   }
