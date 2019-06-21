package com.tyss.javaprogram.myarraylist;

import java.util.logging.Logger;

public class MainArray {
	private static final Logger log = Logger.getLogger("array");
    
	public static void main(String[] args) {
		  long start=System.currentTimeMillis();
		MyArrayClass mac = new MyArrayClass();
          int size=10;
		// adding value
		for (int i = 0; i <size; i++) {
			mac.add("value " + i);
		}
		log.info("remove 4th position");
		mac.remove(4);
		
		// getting value
		for (int i = 0; i < size; i++) {
			log.info("output " + mac.get(i));
		}
		
		
		long end=System.currentTimeMillis();
		
		log.info("time"+(end-start));

	}// End of main
}// End of class
