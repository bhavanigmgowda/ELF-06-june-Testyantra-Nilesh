package com.tyss.javaprogram.annotation;

import lombok.extern.java.Log;
/**
 * @deprecated
 */
@Log
public class Cow extends Animal{
   @Override
   void eat()
   {
	log.info("eat method");   
   }
   
   @Deprecated
   void run()
   {
	   

	   log.info("run method");  
   }
   
}
