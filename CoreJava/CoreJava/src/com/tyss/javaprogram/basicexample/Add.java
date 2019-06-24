package com.tyss.javaprogram.basicexample;

import lombok.extern.java.Log;

@Log
public class Add {
	public static void main(String[] args) {
		int a = 5;
		int b = 15;

		int res = add(a, b);
		int pro = product(a, b);
		log.info("add" + res);
		log.info("product" + pro);

	}

	static int add(int a, int b) {
		return a + b;
	}

	static int product(int a, int b) {
		return a * b;
	}
}
