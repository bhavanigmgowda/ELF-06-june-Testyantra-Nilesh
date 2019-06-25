package com.tyss.javaprogram.assignmentthree;

public class Driver {
	void drive(Car c) {
		if (c instanceof Audi) {
			System.out.println("drive Audi");
		} else if (c instanceof Benz) {
			System.out.println("drive Benz");
		}
	}

	public static void main(String[] args) {
		Benz a = new Benz();
		Driver d = new Driver();
		d.drive(a);
	}// end of method
}// end of class
