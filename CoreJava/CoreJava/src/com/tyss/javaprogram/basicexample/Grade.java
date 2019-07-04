package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class Grade {
	public static void main(String[] args) {
		double percent = 60.6;

		if (percent > 60) {
			log.info("you get first Division");
		} else if (percent > 50) {
			log.info("you get second division");
		} else if (percent > 40) {
			log.info("you get third division");
		} else {
			log.info(" you are fail");
		}
	}
}
