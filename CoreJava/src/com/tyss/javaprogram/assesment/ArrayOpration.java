package com.tyss.javaprogram.assesment;

import java.util.Arrays;
import java.util.logging.Logger;

public class ArrayOpration {
	  private static final  Logger log=Logger.getLogger("array");
   public static void main(String[] args) {
	 
	   int arr[]={5,6,8,2,1};
	   int arr1[]= {5,7,8,5,4};
	   int tem[]=new int[5];
	   Arrays.sort(arr);
	   
	   for (int i : arr) {
         log.info(" "+i);		
	}
	   log.info("================");
	   int res=Arrays.binarySearch(arr1,8);
	   log.info(" "+res);
	   log.info("================");
	   boolean check=Arrays.equals(arr,arr1);
	   log.info(""+check);
	   log.info("================");
	   System.arraycopy(arr,0,tem,0,5);
	   for (int i : tem) {
		log.info(" "+i);
	}
	   System.arraycopy(arr,0,tem,0,5);
}
}
