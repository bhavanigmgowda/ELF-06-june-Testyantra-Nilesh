package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import lombok.extern.java.Log;
@Log
public class Test3 {
   
	 public static void main(String[] args) {
			
		  ArrayList<Double> arr=new ArrayList<>();
		  arr.add(9.2);
		  arr.add(1.5);
		  arr.add(6.9);
		  arr.add(2.4);
		  arr.add(3.6);
		  
		  log.info("before----------> "+arr);
		  
		 Object ref= arr.set(2,5.9);
		  log.info("remove ele= "+ref);
		  log.info("after------>"+arr);
		  
}
}
