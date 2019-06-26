package com.tyss.javaprogram.enumexample;
import lombok.extern.java.Log;
/**
 *  new feture java 1.7 multiple catch block
 * @author Administrator
 *
 */

@Log
public class ExceptionExample {
   public static void main(String[] args) {
	 
	   
	      try {
	    	  
	      }
	      catch (ArithmeticException  |NullPointerException e) {
	    	  log.info(e.getMessage());
		}
	      catch (Exception e) {
	    	  log.info(" IAM General Catch block");
		}
}
}
