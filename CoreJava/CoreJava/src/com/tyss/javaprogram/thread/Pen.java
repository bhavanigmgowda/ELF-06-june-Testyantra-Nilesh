package com.tyss.javaprogram.thread;

import lombok.extern.java.Log;

/**
 * example of Thread
 * 
 * @author Administrator
 */
@Log
public class Pen extends Thread {

	@Override
	public void run() {
		 String s=getName();
		  log.info(""+s);
		for (int i = 0; i < 5; i++) {
			log.info("" + i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				log.severe(""+e);
			}
		}
	}// end of method
}// end of class
