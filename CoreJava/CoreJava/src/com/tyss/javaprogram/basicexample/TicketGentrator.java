package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class TicketGentrator {
	public static void main(String[] args) {
		int age = 75;
		double ticketPrice = 100;
		if (age >= 50) {
			ticketPrice = ticketPrice - ((ticketPrice * 15.2) / 100);
		}

		log.info("ticket price" + ticketPrice);

	}// end of method
}// end of class
