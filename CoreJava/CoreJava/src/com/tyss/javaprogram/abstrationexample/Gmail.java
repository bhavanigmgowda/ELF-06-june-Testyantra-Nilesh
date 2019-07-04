package com.tyss.javaprogram.abstrationexample;

import lombok.extern.java.Log;

@Log
class Gmail extends Google{

	void sharedDocument() {
	   log.info("share with gmail");   
	}
	  
  }// end of class
