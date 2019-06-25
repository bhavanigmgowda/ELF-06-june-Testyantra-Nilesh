package com.tyss.javaprogram.methodreference;

import lombok.extern.java.Log;

@Log
public class BoyTest {
      public static void main(String[] args) {
		  
    	 BoyInterface bf=Boy::new;
    	 Boy b= bf.getinfo("ronak",5.5,22);
    	 log.info(""+b.name);
    	 log.info(""+b.height);
    	 log.info(""+b.age);
    	 
	}
}
