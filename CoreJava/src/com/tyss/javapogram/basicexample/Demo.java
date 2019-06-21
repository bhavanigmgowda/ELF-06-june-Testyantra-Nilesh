package com.tyss.javapogram.basicexample;

public class Demo {
     public static void main(String[] args) {
            Mobile b=new Mobile();
            b.clr="blue";
            b.price=50000;
            b.model="pixel";
            b.call();
	} 
 }
  class Mobile
  {
	    int price;
	    String model;
	    String clr;
	    
	    void call()
	    {
	    	System.out.println("call to someone ");
	    }
	    
  }