package com.tyss.javaprogram.pattern;

public class Pattern2 {
	public static void main(String[] args) {
		int space = 7 / 2, ele = 1;
		int k=1;
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= ele; k++) {
				System.out.print("*");

			}
			if(k<=7/2)
			{
				ele=(ele*2)-1;
				space=--space;
			}
			else
			{
				ele=ele-2;
				space=++space;
			}

			System.out.println();
		}
	}
}
