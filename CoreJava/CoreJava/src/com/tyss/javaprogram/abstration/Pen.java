package com.tyss.javaprogram.abstration;

import lombok.extern.java.Log;

/*
 * 
 */
@Log
public abstract class Pen {
	void draw() {
		log.info("draw method");
	}// end of method

	abstract void write();// Abstract method

	abstract void color();// abstract method
}// end of class
