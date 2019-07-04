package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class LanguageSelection {
	public static void main(String[] args) {
		int input = 2;

		switch (input) {
		case 1:
			log.info("selected language is Kannada");
			break;
		case 2:
			log.info("selected language is English");
			break;
		case 3:
			log.info("selected language is Hindi");
			break;
		case 4:
			log.info("selected language is Tamil");
			break;

		default:
			log.info("Invalid Option");
			break;
		}
	}// end of method
}// end of class
