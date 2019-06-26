package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import lombok.extern.java.Log;
@Log
public class Test10 {
	 public static void main(String[] args) {
			
		  ArrayList<Double> arr=new ArrayList<Double>();
		  arr.add(9.2);
		  arr.add(1.5);
		  arr.add(6.9);
		  arr.add(2.4);
		  arr.add(3.6);
		  
		  log.info(""+"before----------> "+arr);
		  
		  arr.add(3,69.5);
		  
		  log.info(""+"after------>"+arr);
		  
}
}
