package com.tyss.javaprogram.thread;

import lombok.extern.java.Log;

@Log
public class Pvr {
  synchronized void book()
   {
	   for (int i = 0; i <5; i++) {
	    log.info(""+i);
	    try {
			//Thread.sleep(1000);
	    	  wait();
		} catch (InterruptedException e) {
			 log.severe(""+e);
		}
	}
   }
  
      synchronized void leave()
      {
    	  notifyAll();
      }
}
