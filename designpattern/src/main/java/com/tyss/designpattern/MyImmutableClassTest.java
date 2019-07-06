package com.tyss.designpattern;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
 
	public static void main(String[] args) {
		MyImmutableClass immutableClass=new MyImmutableClass("Ronak",17,99857452104l);
	    log.info("name"+immutableClass.getName());
	    log.info("name"+immutableClass.getAge());
	    log.info("name"+immutableClass.getPhone());
	   
		
	}// End Of main
}// End of Class
