package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import lombok.extern.java.Log;
@Log
public class Test6 {
	 public static void main(String[] args) {
			
		  ArrayList<Double> arr=new ArrayList<>();
		  arr.add(9.2);
		  arr.add(1.5);
		  arr.add(6.9);
		  arr.add(2.4);
		  arr.add(3.6);
		  
		  ArrayList<Double> arr1=new ArrayList<>();
		  arr1.add(200.00);
		  arr1.add(351.00);
		  
		  log.info("before----------> "+arr);
		  
		     arr.addAll(arr1);
		  
		  log.info("after------>"+arr);
		  
}
}
