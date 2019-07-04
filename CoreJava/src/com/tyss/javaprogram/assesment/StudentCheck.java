package com.tyss.javaprogram.assesment;

import lombok.extern.java.Log;

@Log
public class StudentCheck {
      
	public Object validate(Student s)throws ExamValidation {
		
		if(s.attendence>75)
		{
			log.info("Eligiable for exam");
			return null;
		}
		else
		{
			throw new ExamValidation();
		}
	} 
	 
	 
	  
}
