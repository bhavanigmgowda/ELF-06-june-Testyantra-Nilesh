package com.tyss.javaprogram.exception;

@SuppressWarnings("serial")
public class CustomException extends RuntimeException {
     
	private final String msg;
	
	 public CustomException(String msg)
	{
		this.msg=msg;
	}
	 
	 @Override
	public String getMessage() {
		return this.msg;
	}
	 
	 @Override
	public String toString() {
		return this.msg;
	}
}
