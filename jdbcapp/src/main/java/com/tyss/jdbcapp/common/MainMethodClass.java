package com.tyss.jdbcapp.common;

public class MainMethodClass {
	public static void main(String[] args) {
        
		A a =new A();
	
		 Connection my=DriverManager.getConnection(args[0]);
		my.printMsg();
		
	}// end of main
} // end of class
