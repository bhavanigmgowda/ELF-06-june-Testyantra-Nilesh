package com.tyss.unittestcase.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Administrator Test cases - WAP to calculate simple interest,
 *         percentage, factorial and write the unit test case.
 * 
 */
public class MathCalculationTest {

	private MathCalculation mc = new MathCalculation();

	@Test
	public void caculateIntrestTest() {
		assertEquals(3125.0, mc.caculateIntrest(5000, 12.5, 5), 0);

	}

	@Test
	public void calculatePercentageTest() {
		double actual = mc.calculatePercentage(50, 50, 50);
		double expected = 50.0;
		assertEquals(expected, actual, 0);
	}

	@Test
	public void calculateFatorialTest() {
		assertEquals(120, mc.calculateFatorial(5));
	}
}
