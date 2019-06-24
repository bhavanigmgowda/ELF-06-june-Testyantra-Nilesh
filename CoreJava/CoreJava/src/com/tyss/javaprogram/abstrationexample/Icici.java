package com.tyss.javaprogram.abstrationexample;

import lombok.extern.java.Log;

@Log
public class Icici implements Atm {


	public void validate() {
		 log.info("validate by icici");  
	}

	
	public void getInfo() {
		 log.info("info by icici");		
	}

}
