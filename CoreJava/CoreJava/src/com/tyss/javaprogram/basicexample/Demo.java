package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

public class Demo {
     public static void main(String[] args) {
            Mobile b=new Mobile();
            b.clr="blue";
            b.price=50000;
            b.model="pixel";
            b.call();
	} 
 }
@Log
  class Mobile
  {
	    int price;
	    String model;
	    String clr;
	    
	    void call()
	    {
	    	log.info("call to someone ");
	    }
	    
  }