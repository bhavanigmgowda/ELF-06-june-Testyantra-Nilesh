package com.tyss.javaprogram.thread;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {

	@Override
	public void run() {
		 log.info("marker method");
		 for (int i = 0; i <5; i++) {
	          log.info(""+i);
	          try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				log.severe(""+e);
			}
		}
	}
    
}
