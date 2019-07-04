package com.tyss.javaprogram.methodreference;

import lombok.extern.java.Log;

@Log
public class TestFact {
     public static void main(String[] args) {
	     CalculateFact cf=new CalculateFact();
	     
	     FactInterface fi=cf::factorial;
	    int res= fi.fact(5);
	    log.info(""+res);
	}
     
}
