package com.tyss.javaprogram.thread;

import lombok.extern.java.Log;

@Log
public class Test1 {
        public static void main(String[] args) {
			Pvr p=new Pvr();
			Browser b=new Browser(p); // runnable state
			b.start();  // running state
			
			Browser b1 =new Browser(p);
			b1.start();
			Browser b2 =new Browser(p);
			b2.start();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				 log.severe(""+e);
			
			}
			
			  p.leave();
		}//end of main
}//end of class
