package com.tyss.javaprogram.assesment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Logger;

public class Factorial {
	private static Logger log=Logger.getLogger("factorial");
	public static void main(String[] args) {

		Function<Integer, Integer> factorial = (i) -> {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact = fact * i;
			}
			return fact;
		};
		
		log.info(""+factorial.apply(5));
		
	}
    
	
}
