package com.tyss.javaprogram.assignmentthree;

public class Baby {
	void recive(IceCream c) {
		c.eat();
	}

	public static void main(String[] args) {
		IceCream ic = new IceCream();
		Baby b = new Baby();
		b.recive(ic);

	}// end of method
}// end of class
