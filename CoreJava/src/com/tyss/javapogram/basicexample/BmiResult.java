package com.tyss.javapogram.basicexample;

public class BmiResult {
	public static void main(String[] args) {
		double h=5.2;
		int w=75;
		double bmi=calculate(h,w);
		System.out.println("BMI "+bmi);
		  report(bmi);
	}

	 static void report(double bmi) {
		if(bmi>25)
		{
			System.out.println("person is overweight");
		}
		else if(bmi>18.5)
		{
            System.out.println("person is Normal weight");			
		}
		else if(bmi<18.5)
		{
			System.out.println("underweight");
		}
		else
		{
			System.out.println("obesity");
		}
	}

	static double calculate(double h, int w) {
         double res=w/(h*h);
		 return res;
	}
}
