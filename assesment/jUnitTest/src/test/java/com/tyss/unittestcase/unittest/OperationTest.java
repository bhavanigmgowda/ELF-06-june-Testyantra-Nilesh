package com.tyss.unittestcase.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * unit Testcase WAP to calculate average of three numbers, area of circle, NCR
 * and write a unit test case
 * 
 * @author Administrator
 *
 */
public class OperationTest {

	private Operation o = new Operation();

	@Test
	public void calculateAvarageTest() {
		assertEquals(50.0, o.calculateAvarage(50, 50, 50), 0);
	}

	@Test
	public void areaOfCircleTest() {
		assertEquals(113.04, o.areaOfCircle(6), 0);

	}

	@Test
	public void calculateNcr() {
		assertEquals(1.0, o.calculateNcr(5, 0), 0);

	}

}
