package com.tyss.javaprogram.enumexample;
import lombok.extern.java.Log;

@Log
public class Switch {
       public static void main(String[] args) {
    	   String s="apple";
    	   
    	   switch (s) {
		case "apple":
	         log.info("apple");		
	 		break;
           case "cat":
        	   log.info("cat");	
			break;

		default:    log.info("invalid");	
			break;
		}
	}  
	
	
	
	
	
}
