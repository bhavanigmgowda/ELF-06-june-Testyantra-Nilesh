package com.tyss.javaprogram.exception;

public class Patym {
	void book()  {
		System.out.println("booking started");

		IRCTC i = new IRCTC();

		i.checkamount();
		try {
			

		} catch (Exception e) {
			System.out.println("handled by patym");
			throw e;
		}

		System.out.println("booking Ended");
	}
}
