package com.tyss.javaprogram.lamda;

import lombok.extern.java.Log;

@Log
public class WishDemo {
       public static void main(String[] args) {
		 
    	Morning m=()->log.info("good morning");
    	m.wish();
    	 
		 
       }
}
