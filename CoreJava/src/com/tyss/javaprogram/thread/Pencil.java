package com.tyss.javaprogram.thread;

import java.util.concurrent.Callable;

public class Pencil implements Callable<Integer> {


	public Integer call() throws Exception {   
		return 120;
	}
	

}
