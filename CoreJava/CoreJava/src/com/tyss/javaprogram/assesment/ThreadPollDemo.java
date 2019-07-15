package com.tyss.javaprogram.assesment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPollDemo {
	
	  public static void main(String[] args) {
		ThreadPoolOne poolone=new ThreadPoolOne();
		ThreadPoolOne pooltwo=new ThreadPoolOne();
		ThreadPoolOne poolthree=new ThreadPoolOne();
		ThreadPoolOne poolfour=new ThreadPoolOne();
		ThreadPoolOne poolfive=new ThreadPoolOne();
		
		//tpo.start();
		//tpo1.start();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(poolone);
		es.execute(pooltwo); 
		es.execute(poolthree);
		es.execute(poolfour);
		es.execute(poolfive);
		
		
	}
}
