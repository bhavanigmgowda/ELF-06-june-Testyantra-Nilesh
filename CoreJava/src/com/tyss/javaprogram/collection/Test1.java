package com.tyss.javaprogram.collection;

import java.util.ArrayList;

public class Test1 {
	 public static void main(String[] args) {
			
		  ArrayList<Double> arr=new ArrayList<Double>();
		  arr.add(9.2);
		  arr.add(1.5);
		  arr.add(6.9);
		  arr.add(2.4);
		  arr.add(3.6);
		  
		  System.out.println("before----------> "+arr);
		  arr.add(20.22);
		   
		  
		  System.out.println("after------>"+arr);
		
}
}
