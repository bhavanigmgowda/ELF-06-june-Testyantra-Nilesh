package com.tyss.javaprogram.assignsix;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class MainDemoFactorial {
  public static void main(String[] args) {
	
	  Function<Integer,Integer> p=i->
	  {
		  int fact=1;
	      for (int j =1; j <=i; j++) {
		       fact=fact*j;	
		}
	      return fact;
	  };
	int fact=p.apply(5);
	
	log.info(""+fact);
} 
}
