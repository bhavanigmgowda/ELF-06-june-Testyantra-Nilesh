package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class VendingMachine {
	public static void main(String[] args) {
		int option = 50;

		switch (option) {
		case 10:
			log.info("lays");
			break;
		case 20:
			log.info("Kurkure");
			break;
		case 50:
			log.info("DairyMilk");
			break;
		default:
			log.info("enter valid option");
			break;
		}

	}
}
