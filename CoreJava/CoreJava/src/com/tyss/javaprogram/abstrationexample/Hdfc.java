package com.tyss.javaprogram.abstrationexample;

import lombok.extern.java.Log;

@Log
public class Hdfc implements Atm {

	public void validate() {
         log.info("validate by Hdfc");  
	}

	public void getInfo() {
		 log.info("info by Hdfc");		
	}
      
}
