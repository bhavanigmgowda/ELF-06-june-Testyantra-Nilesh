package com.tyss.javaprogram.abstration;

import lombok.extern.java.Log;

@Log
public class Sony implements Printer {
        
	public void print() {
		log.info("print");
	}
}
