package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import lombok.extern.java.Log;
@Log
public class Test5 {

	 public static void main(String[] args) {
			
		  ArrayList<Double> arr=new ArrayList<>();
		  arr.add(9.2);
		  arr.add(1.5);
		  arr.add(6.9);
		  arr.add(2.4);
		  arr.add(3.6);
		  
		  log.info("before----------> "+arr);
		   
		   boolean a = arr.remove(2.4);
		   
		   log.info("element remove "+a); 
		  
		  
		  log.info("after------>"+arr);
		  
}
}
