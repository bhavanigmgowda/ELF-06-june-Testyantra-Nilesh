package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class LargestNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 95;

		if (b < a && c < a) {
			log.info(a + "is greatest number");
		} else if (c < b) {
			log.info(b + " is greatest number");
		} else {
			log.info(c + " is greatest number");
		}
	}// end of class
}// end of method
