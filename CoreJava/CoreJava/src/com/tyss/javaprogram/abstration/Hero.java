package com.tyss.javaprogram.abstration;

 /*
  *  hero class child class of honda 
  */

import java.util.logging.Logger;
     
public class Hero extends Honda {
	Logger log = Logger.getLogger("abstraction");

	void design() {

		log.info("design method");
	}

	public static void main(String[] args) {
		Honda a = new Hero();
		a.engine();
		a.design();

	}// end of method
}//end of class