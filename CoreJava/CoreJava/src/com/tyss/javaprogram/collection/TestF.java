package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import lombok.extern.java.Log;
@Log
public class TestF {
	  public static void main(String[] args) {
		
		  ArrayList<Double> arr=new ArrayList<>();
		  arr.add(50.20);
		  arr.add(50.0);
		  
		  for (int i = 0; i < arr.size(); i++) {
			double d=arr.get(i);
			log.info(""+d);
		}
	}

}
