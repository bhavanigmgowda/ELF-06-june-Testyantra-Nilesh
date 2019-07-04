package com.tyss.javaprogram.inheritance;

public class Father {
	void bike() {
		System.out.println("simple bike");
	}

}

class Son extends Father {
	@Override
	void bike() {
		System.out.println("modified bike");
	}// end of method
}// end of class
