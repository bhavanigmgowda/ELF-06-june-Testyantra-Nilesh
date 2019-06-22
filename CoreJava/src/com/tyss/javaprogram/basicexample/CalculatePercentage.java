package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class CalculatePercentage {
	public static void main(String[] args) {
		double total = 500;
		double obtain = 270;

		double per = calculate(total, obtain);
		log.info("percentage is" + per);

	}// end of main 

	static double calculate(double total, double obtain) {
		return (obtain * 100) / total;
	}
}// end of class
