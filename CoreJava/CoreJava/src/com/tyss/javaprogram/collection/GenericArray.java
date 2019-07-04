package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;
@Log
public class GenericArray {

	 public static void main(String[] args) {
			
		  ArrayList<Double> arr=new ArrayList<>();
		  arr.add(50.20);
		  arr.add(50.0);
		  
		  
		       Iterator<Double> it=arr.iterator();
		       
		       while (it.hasNext()) {
		    	   Double type = it.next();
				
				log.info(""+type);
			}
	 }
}
