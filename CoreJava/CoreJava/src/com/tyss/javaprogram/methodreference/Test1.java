package com.tyss.javaprogram.methodreference;

import lombok.extern.java.Log;

@Log
public class Test1 {
	
	 
       public static void main(String[] args) {
		
    	  Adding a=Demo::sum;
    	  
    	  int i=a.add(10,15);
    	  log.info(""+i);
    	 
	}
}
