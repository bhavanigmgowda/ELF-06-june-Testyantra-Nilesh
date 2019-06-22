package com.tyss.javaprogram.inheritance;

public class DemoOverride {
	public static void main(String[] args) {
		Father f = new Son();
		f.bike();

		Father f1 = new Father();
		f1.bike();

	}// end of method

}// end of class
