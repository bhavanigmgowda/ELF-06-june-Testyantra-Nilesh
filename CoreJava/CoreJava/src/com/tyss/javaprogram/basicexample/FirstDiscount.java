package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class FirstDiscount {
	public static void main(String[] args) {
		int visit = 1;
		int item = 2000;

		if (visit == 1) {
			item = 2000 - ((2000 * 10) / 100);

		}

		log.info("your bill is " + item);

	}// end of method
}// end of class
