package com.tyss.javaprogram.abstrationexample;

import lombok.extern.java.Log;

/*
 * abtract class
 */
@Log
public abstract class Google {
       void login()
       {
    	   log.info("login");   
       } 
       abstract void sharedDocument(); //abtract method
       
    	  
      
} // end of class

  
  
  