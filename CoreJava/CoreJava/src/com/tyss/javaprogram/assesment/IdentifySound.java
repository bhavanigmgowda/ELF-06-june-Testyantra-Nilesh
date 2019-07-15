package com.tyss.javaprogram.assesment;

import lombok.extern.java.Log;

@Log
public class IdentifySound {

	void identify(Animal a) {
		if (a instanceof Cat) {
			log.info("meow- meow");

		} else if (a instanceof Dog) {
			log.info("bhaaw-bhaaw");
		}

	}// end of method
}// end of class
