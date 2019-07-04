package com.tyss.javaprogram.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainPool {
	
	public static void main(String[] args) {
	    
		Mouse m1=new Mouse("first");
		Mouse m2=new Mouse("second");
		Mouse m3=new Mouse("third");
		Mouse m4=new Mouse("fourth");
		Mouse m5=new Mouse("fifth");
		
		
		ExecutorService service=Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);
		
		service.shutdown();
	}

}
