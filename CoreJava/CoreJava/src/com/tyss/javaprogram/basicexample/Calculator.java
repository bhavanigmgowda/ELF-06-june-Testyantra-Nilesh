package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

public class Calculator {
	public static void main(String[] args) {

		BmiCalculator b = new BmiCalculator();
		double res = b.calculate(90, 5.5);
		b.Report(res);

	}
}
@Log
class BmiCalculator {

	public double calculate(double weight, double height) {

		return weight * (height * height);
	}

	void Report(double res) {
		if (res > 25) {
			
			log.info("person is overweight \n" + res);
		} else if (res > 18.5) {
			log.info("person is Normal weight \n" + res);
		} else if (res < 18.5) {
			log.info("underweight \n" + res);
		} else {
			log.info("obesity \n" + res);
		}
	}

}