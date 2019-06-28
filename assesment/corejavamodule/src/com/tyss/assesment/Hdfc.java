package com.tyss.assesment;

import lombok.extern.java.Log;

@Log
public class Hdfc implements Bank {
	/* implemented method  */
	@Override
	public void checkCardInfo() {
		log.info("this card from hdfc");
	}// end of method

}// end of method
