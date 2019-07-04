package com.tyss.javaprogram.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class ArrayDemo {
          public static void main(String[] args) {
			  int a[]={2,5,9,8};
        	  Predicate<Integer> ai=c->c%2!=0;
        		              for(int i=0;i<a.length;i++)
        		              { 
        		            	if(ai.test(a[i]))
        		            	{
        		            		log.info(""+a[i]);
        		              }
        	  };
		}
}
