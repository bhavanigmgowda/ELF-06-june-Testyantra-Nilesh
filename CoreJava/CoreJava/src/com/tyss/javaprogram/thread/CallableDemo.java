package com.tyss.javaprogram.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;
@Log
public class CallableDemo {
   public static void main(String[] args) {
	
	   Pencil p=new Pencil();
	   
	   FutureTask<Integer> ft=new FutureTask<>(p);
	   Thread t=new Thread(ft);
	   t.start();
	   
	   try {
		int i=ft.get();
		log.info(""+i);
	} catch (InterruptedException e) {
		e.printStackTrace();
	} catch (ExecutionException e) {
		e.printStackTrace();
	}
	   
}
}
