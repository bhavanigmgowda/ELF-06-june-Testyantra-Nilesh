package com.tyss.javaprogram.collection;

import java.util.ArrayList;

public class Test3 {
   
	 public static void main(String[] args) {
			
		  ArrayList<Double> arr=new ArrayList<Double>();
		  arr.add(9.2);
		  arr.add(1.5);
		  arr.add(6.9);
		  arr.add(2.4);
		  arr.add(3.6);
		  
		  System.out.println("before----------> "+arr);
		  
		 Object ref= arr.set(2,5.9);
		  System.out.println("remove ele= "+ref);
		  System.out.println("after------>"+arr);
		  
}
}
