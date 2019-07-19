package com.tyss.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.java.Log;
@Log
public class MessageBean {
       private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
       
      @PostConstruct 
	public void init()
	{
	   log.info("intialization phase");  	
	}
	@PreDestroy
	public void destroy()
	{
		 log.info("destroy phase");  	
	}
}
