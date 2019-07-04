package com.tyss.javaprogram.assignmentfive;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import lombok.extern.java.Log;

@Log
public class FileHandling {
	public static void main(String[] args) {

		try (BufferedWriter bf = new BufferedWriter(new FileWriter("excel.csv"));
				CSVPrinter csv = new CSVPrinter(bf,
						CSVFormat.DEFAULT.withHeader("Name", "Age", "Designation", "Salary"));) {

			csv.printRecord("Sundar Pichai", "23", "tester", "25000");
			csv.flush();
			log.info("file is written");
		} catch (IOException e) {
			log.severe("" + e);
		}

	}
}
