package com.tyss.javaprogram.methodreference;

public class PenDemo {
      public static void main(String[] args) {
		  
    	 PenFactory pf=Pen::new;
    	 Pen p=pf.getPen();
    	 
	}
}
