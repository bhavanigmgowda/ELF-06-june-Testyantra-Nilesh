package com.tyss.javaprogram.assesment;

import lombok.extern.java.Log;

@Log
public class Sbi implements Bank {
      
	/* implemented method  */
	@Override
	public void checkCardInfo() {  
		log.info("this card from SBI");
	}// end of method
}// end of method
