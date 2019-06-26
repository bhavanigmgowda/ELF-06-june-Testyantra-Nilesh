package com.tyss.javaprogram.arrayprogram;

import lombok.extern.java.Log;

@Log
public class CopyArray {
	public static void main(String[] args) {

		int a[] = { 5, 3, 2, 1, 4 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];
		}

		for (int i : b) {
			log.info(" " + i);
		}
		log.info("");
		for (int i : a) {
			log.info(" " + i);
		}
	}
}
