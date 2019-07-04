package com.tyss.javaprogram.methodreference;

import lombok.extern.java.Log;

@Log
public class Test {
     
	  static void open()
	  {
	       log.info("open door");	  
	  }
	 
	public static void main(String[] args) {
	
		
		 Room r=Test::open;
		 r.remove();
}
}
