package com.tyss.javaprogram.exception;
import lombok.extern.java.Log;

@Log
public class IRCTC {
	void checkamount() {

		log.info(""+"check amount");
		try {
			int d=0;
			int i = 500 /d;
			log.info(""+i);
		} catch (Exception e) {
			log.info(""+"exception in Irctc");
			throw e;
		}

		log.info(""+"amount checked");
	}
}
