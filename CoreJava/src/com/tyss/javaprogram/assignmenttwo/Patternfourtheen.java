package com.tyss.javaprogram.assignmenttwo;

public class Patternfourtheen {
	   public static void main(String[] args) {
		for (int i = 0; i <=5; i++) {
			for (int j = 0; j <=5; j++) {
				if(j<5/2)
				System.out.print(" ");
				else if(j==5/2 ||i==5/2)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	}
