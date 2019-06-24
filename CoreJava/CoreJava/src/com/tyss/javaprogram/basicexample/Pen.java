package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
class Pen {
	String clr;
	int cost;

	void write() {
		log.info("write something");
	}

	public static void main(String[] args) {
		Pen p = new Pen();
		p.clr = "blue";
		p.cost = 100;
		p.write();
	}// end of method
}// end of class
