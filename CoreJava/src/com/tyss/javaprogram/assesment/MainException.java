package com.tyss.javaprogram.assesment;

import lombok.extern.java.Log;

@Log
public class MainException {
  
	public static void main(String[] args) {
		StudentCheck check=new StudentCheck();
		
		Student student=new Student();
		student.attendence=60;
		
		try {
			check.validate(student);
		} catch (ExamValidation e) {
			log.info(""+e);
		}
		
	}
} 
