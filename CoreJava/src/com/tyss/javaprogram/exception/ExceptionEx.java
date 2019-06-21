package com.tyss.javaprogram.exception;

public class ExceptionEx {
	public static void main(String[] args) {

		try {
			int i = 20 /5;
			String a = null;
			System.out.println(a.length());
			String no="20.5";
			int number=Integer.parseInt(no);
			

		} catch (ArithmeticException e) {
		     System.out.println("number not divide by zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("pointing towards null object");
		}
		catch (NumberFormatException e) {
       	      System.out.println("check parsing and correct your parsing method");	
		}
		catch (Exception e) {
    	   System.out.println("genral Exception");	
		}
	}
}
