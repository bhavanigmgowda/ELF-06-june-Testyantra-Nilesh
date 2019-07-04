package com.tyss.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class B implements Connection{
    
	public void printMsg() {
      log.info("BBBBBB");   		
	}

}// end of class
