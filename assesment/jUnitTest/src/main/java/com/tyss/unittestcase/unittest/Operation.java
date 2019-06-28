package com.tyss.unittestcase.unittest;

/**
 * 
 * @author Administrator WAP to calculate average of three numbers, area of
 *         circle, NCR and write a unit test case
 */
public class Operation {

	// private static final double pie = 3.14;

	double calculateAvarage(double number1, double number2, double number3) {
		return (number1 + number2 + number3) / 3;
	}

	double areaOfCircle(int radius) {
		return 3.14 * (radius * radius);
	}

	double calculateNcr(int n, int r) {
		return calculateFatorial(n) / (calculateFatorial(n) - calculateFatorial(r));
	}

	int calculateFatorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
