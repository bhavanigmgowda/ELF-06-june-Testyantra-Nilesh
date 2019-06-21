package com.tyss.javapogram.basicexample;

public class Calculator 
{
       public static void main(String[] args) {
    	     
    	  BmiCalculator b=new BmiCalculator();
    	   double res= b.calculate(90,5.5);
    	               b.Report(res);
    	   
		
	}
}
  class BmiCalculator
  {
	 
	    
	    public double calculate(double weight, double height)
	    {
	    	double res=weight*(height*height);
	    	
	    	return res;
	    }
	    
	    void Report(double res)
	    {
	    	if(res>25)
			{
				System.out.println("person is overweight \n"+res);
			}
			else if(res>18.5)
			{
	            System.out.println("person is Normal weight \n"+res);			
			}
			else if(res<18.5)
			{
				System.out.println("underweight \n"+res);
			}
			else
			{
				System.out.println("obesity \n"+res);
			}
	    }
	    
  }