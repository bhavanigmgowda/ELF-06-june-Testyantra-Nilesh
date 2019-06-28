package com.tyss.unittestcase.unittest;

/**
 * WAP to calculate simple interest, percentage, factorial and write the unit
 * test case.
 * 
 */
public class MathCalculation {

	double caculateIntrest(int principal, double rate, int time) {
		return (principal * rate * time) / 100;
	}

	double calculatePercentage(double p1, double p2, double p3) {
		return ((p1 + p2 + p3) * 100) / 300;
	}

	int calculateFatorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

}// end of class
