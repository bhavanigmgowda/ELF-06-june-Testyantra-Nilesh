package com.tyss.javaprogram.collection;

import java.util.ArrayList;

public class TestF {
	  public static void main(String[] args) {
		
		  ArrayList<Double> arr=new ArrayList<Double>();
		  arr.add(50.20);
		  arr.add(50.0);
		  
		  for (int i = 0; i < arr.size(); i++) {
			double d=arr.get(i);
			System.out.println(d);
		}
	}

}
