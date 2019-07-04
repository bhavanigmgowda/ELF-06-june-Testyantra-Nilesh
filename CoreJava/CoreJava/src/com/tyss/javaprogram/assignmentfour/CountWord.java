package com.tyss.javaprogram.assignmentfour;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log

public class CountWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		log.info("enter your word");
		String sen = s.nextLine();
		char ch[] = sen.toCharArray();

		int count = 0;
		String a = "";
		String b = "";

		for (int j = 0; j < ch.length; j++) {
			if (ch[j] != ' ') {
				a = a + ch[j];
				count++;
			}

			else {
				b += a + count + " ";
				a = "";
				count = 0;
			}

		}
		b += a + count;
		log.info(b);

		s.close();
	}// end of method
}// end of class
