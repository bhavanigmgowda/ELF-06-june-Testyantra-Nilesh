package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListItratorGeneric {
	
	 public static void main(String[] args) {
			
		  ArrayList<Double> arr=new ArrayList<Double>();
		  arr.add(50.20);
		  arr.add(999.00);
		  
		  
		  
		  
		  System.out.println("======================");
		  
		       ListIterator <Double> it=arr.listIterator(arr.size());
		       
		       while (it.hasPrevious()) {
		    	   Double type = it.previous();
				
				System.out.println(type);
			}
	 }

}
