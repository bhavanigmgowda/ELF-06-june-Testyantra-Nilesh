package com.tyss.javapogram.basicexample;

public class CalculatePercentage {
	public static void main(String[] args) 
	{
		double total=500;
	    double obtain=270;
	    
	    double per=calculate(total,obtain);
	    System.out.println("percentage is"+per);

	
	}
    	static double calculate(double total, double obtain) 
	{
		double per=(obtain*100)/total;
		return per;
	}
}
