package com.tyss.javaprogram.exception;
import lombok.extern.java.Log;

@Log
public class Word {
	
	String name="Ron";
    void validate()
    {
    	if(name.length()>=5)
    	{
    		log.info(""+"word length greater than 5");
    	}
    	else
    	{
    		
    		throw new CustomException("word lenght less than 5");
    	}
    }
}
