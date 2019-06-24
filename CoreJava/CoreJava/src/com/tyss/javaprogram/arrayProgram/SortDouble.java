package com.tyss.javaprogram.arrayProgram;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class SortDouble {

	public static void main(String[] args) {

		double[] a = { 2.4, 6.9, 3.2, 4.6, 4 };

		Arrays.sort(a);

		for (double i : a) {
			log.info(i + " ");
		}

	}

}
