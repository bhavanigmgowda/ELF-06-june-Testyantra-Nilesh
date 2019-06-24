package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class OddEven {
	public static void main(String[] args) {
		int a = 5;

		if (a % 2 == 0) {
			log.info("number is even");
		} else {
			log.info("number is odd");
		}
	}// end of method
}// end of class
