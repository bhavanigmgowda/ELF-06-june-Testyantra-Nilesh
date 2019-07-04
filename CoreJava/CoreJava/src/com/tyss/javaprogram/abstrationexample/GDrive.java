package com.tyss.javaprogram.abstrationexample;

import lombok.extern.java.Log;

@Log
class GDrive extends Google
{

	void sharedDocument() {
		log.info("share with GDrive");
	}
	  
}// end of class

