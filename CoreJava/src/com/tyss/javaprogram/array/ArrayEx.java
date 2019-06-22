package com.tyss.javaprogram.array;

import lombok.extern.java.Log;

@Log
public class ArrayEx {
	  public static void main(String[] args) {
		  double[] arr=new double[4];
			 arr[0]=1;
			 arr[1]=2;
			 arr[2]=3;
			 arr[3]=4;
			log.info(""+arr.length);
			 for (int i = 0; i <arr.length; i++) 
			 {
			    log.info(""+arr[i]);	
			}
	}
	  
}
