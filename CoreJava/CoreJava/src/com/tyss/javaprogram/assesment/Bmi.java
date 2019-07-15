package com.tyss.javaprogram.assesment;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class Bmi {
 public static void main(String[] args) {
     
	 Double i=22.1;
	 
	 Predicate<Double> predicate=(j)->i>20.1;

	 if(predicate.test(12.0)) {
		 log.info("Normal");
	 }
	 else
	 {
		 log.info("UnderWeigth");
	 }
	 
}
}
