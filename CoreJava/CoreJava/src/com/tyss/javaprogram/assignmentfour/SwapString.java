package com.tyss.javaprogram.assignmentfour;

import lombok.extern.java.Log;

@Log
public class SwapString {
	public static void main(String[] args) {
		String a = "Abc def grh ijk lnn";

		String arr[] = a.split(" ");

		for (String string : arr) {
			log.info(string + " ");
		}
		log.info("\n");
		for (int i = 0; i < 3; i++) {
			if (i % 2 != 0) {
				String temp = arr[0];
				String mid = arr[(arr.length - 1) / 2];
				arr[0] = arr[arr.length - 1];
				arr[arr.length / 2] = temp;
				arr[arr.length - 1] = mid;

			}

		}
		for (String string : arr) {
			log.info(string + " ");
		}
	}
}
