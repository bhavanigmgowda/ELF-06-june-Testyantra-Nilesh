package com.tyss.javaprogram.exception;

public class IRCTC {
	void checkamount() {

		System.out.println("check amount");
		try {
			int i = 500 / 0;
		} catch (Exception e) {
			System.out.println("exception in Irctc");
			throw e;
		}

		System.out.println("amount checked");
	}
}
