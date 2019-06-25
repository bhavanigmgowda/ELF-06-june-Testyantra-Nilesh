package com.tyss.javaprogram.thread;

import lombok.extern.java.Log;

@Log
public class TestRunnable {
   public static void main(String[] args) {
	log.info("start main");   
	Marker m=new Marker();
	Thread t=new Thread(m);
	t.start();
	
	Thread t1=new Thread(m);
	t1.start();
	log.info("end main");
}
}
