package com.tyss.javaprogram.exception;

public class Word {
	
	String name="Ron";
    void validate()
    {
    	if(name.length()>=5)
    	{
    		System.out.println("word length greater than 5");
    	}
    	else
    	{
    		
    		throw new CustomException("word lenght less than 5");
    	}
    }
}
