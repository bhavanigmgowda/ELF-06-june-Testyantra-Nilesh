package com.tyss.javaprogram.predicate;
/**
 *  supplier interface
 */

import java.util.function.Supplier;

import lombok.extern.java.Log;


@Log
public class SupplierDemo {
       public static void main(String[] args) {
		
    	   Supplier<Gun> s=()->new Gun(100);   //supplier interface
    	   Gun g=s.get();
    	   log.info(""+g.bullets);
	}
}
