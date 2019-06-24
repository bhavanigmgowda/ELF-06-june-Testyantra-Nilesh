
package com.tyss.javaprogram.arrayProgram;

import java.util.Arrays;

import java.util.Collections;

import lombok.extern.java.Log;

@Log
public class ArraySort {
	public static void main(String[] args) {

		Integer[] a = { 5, 3, 2, 1, 4 };

		Arrays.sort(a);
		Arrays.sort(a, Collections.reverseOrder());
		for (int i : a) {
			log.info("" + i);
		}

	}// end of method
}// end of class
