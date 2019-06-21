package com.tyss.javaprogram.constructor;

public class A {
      int n=90;
      public static void main(String[] args) {
		    B b=new B();
		    b.m();
	}
      
}
 class B extends A
 {
	    int n=60;
	    
	    void m()
	    {
	    	int n=30;
	    	System.out.println(n);
	    	System.out.println(this.n);
	    	System.out.println(super.n);
	    }
	 
 }