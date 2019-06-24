package com.tyss.javaprogram.exception;

import lombok.extern.java.Log;

@Log
public class Patym {
	void book() {
		log.info("" + "booking started");

		IRCTC i = new IRCTC();

		i.checkamount();
		try {

		} catch (Exception e) {
			log.info("" + "handled by patym");
			throw e;
		}

		log.info("" + "booking Ended");
	}
}
