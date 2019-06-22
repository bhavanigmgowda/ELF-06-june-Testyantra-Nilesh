package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class BiggerNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (a < b) {
			log.info("grater number is" + b);
		} else {
			log.info(a + " is greater number");
		}
	}// end of method
}// end of class
