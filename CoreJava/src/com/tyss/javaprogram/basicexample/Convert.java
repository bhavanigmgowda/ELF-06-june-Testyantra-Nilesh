package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class Convert {
	public static void main(String[] args) {
		int rupee = 1000;

		double usd = 69.54;
		double euro = 78.60;
		log.info("Euro =" + (rupee / usd));
		log.info("USD =" + (rupee / euro));
	}
}
