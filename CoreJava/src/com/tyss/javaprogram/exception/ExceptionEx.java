package com.tyss.javaprogram.exception;

import lombok.extern.java.Log;

@Log
public class ExceptionEx {
	public static void main(String[] args) {

		try {
			int i = 20 / 5;
			log.info("" + i);
			String a = "abc";
			log.info("" + a.length());
			int number = Integer.parseInt("20.5");
			log.info("" + number);

		} catch (ArithmeticException e) {
			log.info("" + "number not divide by zero");
		} catch (NullPointerException e) {
			log.info("" + "pointing towards null object");
		} catch (NumberFormatException e) {
			log.info("" + "check parsing and correct your parsing method");
		} catch (Exception e) {
			log.info("" + "genral Exception");
		}
	}
}
