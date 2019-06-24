package com.tyss.javaprogram.overloading;

public class Girl {
	void take(Phone p) {
		if (p instanceof MiPhone) {
			System.out.println("Thank you brother");

		} else if (p instanceof Iphone) {
			System.out.println("I love you");
		}
	}
}
