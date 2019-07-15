package com.tyss.javaprogram.assesment;



public class Singlton {
   
	private static final Singlton singlton=new Singlton();
	
	private Singlton()
	{
		
	}
	
	public static Singlton getInstance()
	{
		return singlton;
	}
}
