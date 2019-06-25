package com.tyss.javaprogram.methodreference;

import lombok.extern.java.Log;

@Log
public class ProductDemo {
      public static void main(String[] args) {
		 
    	  ProductInf pf=Product::new;
    	  Product p=pf.getproduct("Shop",22);
    	  log.info(""+p.name);
    	  log.info(""+p.price);
	}// end of main
}// end of class
