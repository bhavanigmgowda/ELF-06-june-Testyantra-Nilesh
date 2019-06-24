package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class BmiResult {
	public static void main(String[] args) {
		double h = 5.2;
		int w = 75;
		double bmi = calculate(h, w);
		log.info("BMI " + bmi);
		report(bmi);
	}

	static void report(double bmi) {
		if (bmi > 25) {
			log.info("person is overweight");
		} else if (bmi > 18.5) {
			log.info("person is Normal weight");
		} else if (bmi < 18.5) {
			log.info("underweight");
		} else {
			log.info("obesity");
		}
	}

	static double calculate(double h, int w) {
		 
		return  w / (h * h);
	}
}
