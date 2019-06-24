package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class BMI {
	public static void main(String[] args) {
		double weight = 68.4;
		double height = 1.72;
		double result = weight / (height * height);
		log.info("the BMI is" + result);
	}// end of method

}// end of class
