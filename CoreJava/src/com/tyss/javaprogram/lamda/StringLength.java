package com.tyss.javaprogram.lamda;

interface Length{
	int length(String a);
}


public class StringLength {
      public static void main(String[] args) {
    	 Length l= (a)-> {
    		  return a.length();
    			  
    	  };	
	}
	 
}
