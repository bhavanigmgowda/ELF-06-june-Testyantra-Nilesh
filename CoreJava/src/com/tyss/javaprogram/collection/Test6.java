package com.tyss.javaprogram.collection;

import java.util.ArrayList;

public class Test6 {
	 public static void main(String[] args) {
			
		  ArrayList<Double> arr=new ArrayList<Double>();
		  arr.add(9.2);
		  arr.add(1.5);
		  arr.add(6.9);
		  arr.add(2.4);
		  arr.add(3.6);
		  
		  ArrayList<Double> arr1=new ArrayList<Double>();
		  arr1.add(200.00);
		  arr1.add(351.00);
		  
		  System.out.println("before----------> "+arr);
		  
		     arr.addAll(arr1);
		  
		  System.out.println("after------>"+arr);
		  
}
}
