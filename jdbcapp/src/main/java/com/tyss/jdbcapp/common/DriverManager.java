package com.tyss.jdbcapp.common;

public class DriverManager {

	private DriverManager() {

	}

	public static Connection getConnection(String str) {
		Connection ref = null;

		if (str.equals("one")) {
			ref = new A();

		} else {
			ref = new B();

		}

		return ref;
	}

}// end of class
