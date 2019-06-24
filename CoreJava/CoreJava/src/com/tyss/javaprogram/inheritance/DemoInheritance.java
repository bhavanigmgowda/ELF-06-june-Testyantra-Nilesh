package com.tyss.javaprogram.inheritance;

public class DemoInheritance {
	public static void main(String[] args) {
		ScientificCalculator sc = new ScientificCalculator();
		sc.add();
		sc.sub();
		sc.sin();
		sc.cos();

		Calculator c = new Calculator();
		c.add();
		c.sub();

	}// end of method
}// end of class
