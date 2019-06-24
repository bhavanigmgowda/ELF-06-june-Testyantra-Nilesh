package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class FactorialRecursion {
    public static void main(String[] args) {
		int num=4;
		int res=fact(num);
		log.info(""+res);
	}  ///end of method
    static int fact(int n)
    {
    	if(n==0)
    	{
    		return 1;
    	}
    	return n*fact(n-1);
    }// end of method
}// end of class
