package com.tyss.javaprogram.enumexample;
import lombok.extern.java.Log;

@Log
public class TestB {
    public static void main(String[] args) {
		
    	Loan t=Loan.HOME;
    	
    	int constValue=t.getValue();
    	
    	log.info("HOME "+constValue);
    	
        Loan t1=Loan.PERSONAL;
    	
    	int constValue1=t1.getValue();
    	
    	log.info("PERSONAL "+constValue1);
    	
        Loan t2=Loan.CAR;
    	
    	int constValue2=t2.getValue();
    	
    	log.info("PERSONAL "+constValue2);
    	
	}
}
