package com.tyss.javaprogram.assignmentfive;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class WriteExcel {
	public static void main(String[] args) {
		String name = "Ramesh";
		int age = 54;
		String designation = "manager";
		int salary = 50000;

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("Excel.csv"));
			bw.write(name);
			bw.write(age);
			bw.write(designation);
			bw.write(salary);
			bw.flush();
			
			log.info("file written");
		} catch (IOException e) {
			log.severe("" + e);
		} finally {
			if(bw!=null)
			{
				try {
					bw.close();
				} catch (IOException e) {
					log.severe("" + e);
				}
			}

		}

	}// end of method 

}// end of class
