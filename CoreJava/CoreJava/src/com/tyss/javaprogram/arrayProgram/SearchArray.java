package com.tyss.javaprogram.arrayProgram;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class SearchArray {
	public static void main(String[] args) {
		log.info("enter the element ");
		Scanner scn = new Scanner(System.in);
		int se = scn.nextInt();
		int count = 0;
		int a[] = { 5, 3, 2, 1, 4 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] == se) {
				count++;
				break;
			}

			if (count > 0) {
				log.info("elememt is present ");
			} else {
				log.info("element is not present");
			}

		}
		scn.close();
	}

}
