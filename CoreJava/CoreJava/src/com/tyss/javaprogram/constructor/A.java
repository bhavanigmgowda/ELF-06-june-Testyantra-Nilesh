package com.tyss.javaprogram.constructor;
import lombok.extern.java.Log;

public class A {
      int n=90;
      public static void main(String[] args) {
		    B b=new B();
		    b.m();
	}
      
}
@Log
 class B extends A
 {
	    int n=60;
	    
	    void m()
	    {
	    	int n=30;
	    	log.info(""+n);
	    	log.info(""+this.n);
	    	log.info(""+super.n);
	    }
	 
 }