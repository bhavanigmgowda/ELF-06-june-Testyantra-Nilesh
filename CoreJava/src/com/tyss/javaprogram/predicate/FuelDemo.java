package com.tyss.javaprogram.predicate;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class FuelDemo {
     public static void main(String[] args) {
		
    	 Supplier<Car> s=()->new Car(15.2);
    	 Car c=s.get();
         log.info("intial fuel"+c.fuel);	 
	}// end of method
}// end of class
