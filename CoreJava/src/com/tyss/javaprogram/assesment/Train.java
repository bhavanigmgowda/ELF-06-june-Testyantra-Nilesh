package com.tyss.javaprogram.assesment;
import lombok.extern.java.Log;

@Log
public class Train {
	/* search train by name */
	void search(String name) {
		log.info("You train name Karnataka express ");
		log.info("Your Train number is = 2524151 ");
	}// end of method
	/* search train by number */

	void search(int number) {
		log.info("Your Train number is = 2524151");
		log.info("Your Train name is Karnataka express ");
	}// end of method
}// end of class
