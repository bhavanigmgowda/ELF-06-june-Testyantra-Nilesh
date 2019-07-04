package com.tyss.javaprogram.assesment;

public class ExamValidation extends Exception {
    
	String msg="Not Eligible For Exam";
	
	@Override
	public String toString() {
		return this.msg;
		
	}
	 
	   @Override
	public String getMessage() {
		return this.msg;
	}
	
	     
	
}
