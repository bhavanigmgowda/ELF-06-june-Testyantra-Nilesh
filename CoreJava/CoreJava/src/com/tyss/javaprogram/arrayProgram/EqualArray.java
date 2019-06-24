package com.tyss.javaprogram.arrayProgram;

import lombok.extern.java.Log;

@Log
public class EqualArray {
	public static void main(String[] args) {
		int[] a = { 5, 3, 2, 1, 4 };
		int[] b = { 5, 3, 2, 1, 7 };

		@SuppressWarnings("unused")
		boolean equal = true;

		if (a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				if (a[i] == b[i]) {
					equal = true;
				}
			}
			log.info("array is equal");
		} else {
			log.info("array is equal not equal");
		}
	}// end of method
}// end of class
