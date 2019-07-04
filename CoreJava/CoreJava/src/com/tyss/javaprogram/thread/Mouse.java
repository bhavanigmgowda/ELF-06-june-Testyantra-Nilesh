package com.tyss.javaprogram.thread;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {

	String name;
	
	
	
	public Mouse(String name) {
		super();
		this.name = name;
	}



	@Override
	public void run() {
     log.info(""+name+"start");
     for (int i = 0; i <5; i++) {
    	 log.info(""+name+" "+i);
    	 
    	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			log.severe(""+e);
		}
	}
     log.info(""+name+"end");
	}
       
}
