package com.tyss.javapogram.basicexample;

public class VendingMachine {
	public static void main(String[] args) {
		int option=50;

		switch (option) {
		case 10:
              System.out.println("lays");
			break;
		case 20:
			System.out.println("Kurkure");
			break;
		case 50:
			System.out.println("DairyMilk");
			break;
		default:
			System.out.println("enter valid option");
			break;
		}

	}
}
