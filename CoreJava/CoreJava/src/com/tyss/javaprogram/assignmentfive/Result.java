package com.tyss.javaprogram.assignmentfive;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Result {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Student stdArr[] = new Student[2];

		for (int i = 0; i < stdArr.length; i++) {
			stdArr[i] = new Student();
			System.out.println("Enter the name");
			stdArr[i].name = scn.nextLine();
			// scn.nextLine();
			System.out.println("enter the percentage");
			stdArr[i].per = scn.nextDouble();
			scn.nextLine();
		}
		scn.close();
		for (int i = 0; i < stdArr.length; i++) {
			System.out.println(stdArr[i].name);
			System.out.println(stdArr[i].per);

		}

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("StudentInfo"));

			for (int j = 0; j < stdArr.length; j++) {
				if (stdArr[j].per >= 80) {
					bw.write(stdArr[j] + " ");
				}

			}
			System.out.println("file is written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.flush();
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

}
