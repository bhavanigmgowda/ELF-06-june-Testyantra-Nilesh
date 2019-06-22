package com.tyss.javaprogram.inheritance;

import lombok.extern.java.Log;

@Log
public class Calculator {
	   
  public void add()
   {
	   log.info(""+"add numbers");
   }
   
    public void sub()
   {
	   log.info(""+"sub");
   }
   
}
    @Log
   class ScientificCalculator extends Calculator{
	       public void sin()
	        {
	        	log.info(""+"sin from child");
	        }
	       public void cos()
	        {
	        	log.info(""+"cos form child");
	        }
   }