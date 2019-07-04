package com.tyss.javaprogram.predicate;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class SquareFunction {
    public static void main(String[] args) {
		
    	Function<Integer ,Integer> i=a->a*a;
    	Integer res=i.apply(5);
    	  log.info(""+res);
    	
	}
}
