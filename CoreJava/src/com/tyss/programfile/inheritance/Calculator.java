package com.tyss.programfile.inheritance;

public class Calculator {
	   
   void add()
   {
	   System.out.println("add numbers");
   }
   
   void sub()
   {
	   System.out.println("sub");
   }
   
}
   class ScientificCalculator extends Calculator{
	        void sin()
	        {
	        	System.out.println("sin from child");
	        }
	        void cos()
	        {
	        	System.out.println("cos form child");
	        }
   }