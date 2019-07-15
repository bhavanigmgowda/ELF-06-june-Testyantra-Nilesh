package com.tyss.javaprogram.assesment;

import lombok.extern.java.Log;

@Log
public class ThreadPoolOne extends Thread{

	
	  @Override
		public void run() {
			 for (int i = 0; i <5; i++) {
				log.info(""+i);
			}
		}
}
