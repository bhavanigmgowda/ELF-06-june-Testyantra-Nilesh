package com.tyss.javaprogram.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class CheckDemo {
       public static void main(String[] args) {
	      
    	   int a[]={5,4,8,5,6};
    	   
    	   Predicate<Integer> p=c->c>4;
    	                    for (int i = 0; i < a.length; i++) {
								  if(p.test(a[i]))
								  {
									  log.info(""+a[i]);
								  }
							}
	}
}
