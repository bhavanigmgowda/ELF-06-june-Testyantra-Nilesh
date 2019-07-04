package com.tyss.javaprogram.assignmentfive;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import lombok.extern.java.Log;
@Log
public class ReadCsv {
    public static void main(String[] args) {
    	FileReader fr=null;
    	CSVParser cp=null;
		try {
			 fr=new FileReader("excel.csv");
			 cp=new CSVParser(fr, CSVFormat.DEFAULT .withFirstRecordAsHeader().withIgnoreHeaderCase());
			
			 for (CSVRecord csvRecord : cp) {
	                // Accessing Values by Column Index
	                String name = csvRecord.get(0);
	                String age  = csvRecord.get(1);
	                String designation = csvRecord.get(2);
	                String salary = csvRecord.get(3);
	                
	                
	                
	                log.info("name : " + name);
	                log.info("age : " + age);
	                log.info("designation : " + designation);
	                log.info("salary : " + salary);

	                log.info("---------------\n\n");
			 }
		} catch (FileNotFoundException e) {
			log.severe("" + e);
		} catch (IOException e) {
			log.severe("" + e);
		}
		finally {
			if(cp!=null)
			{
				try {
					cp.close();
				} catch (IOException e) {
					log.severe("" + e);
				}
			}
			if(fr!=null)
			{
				try {
					fr.close();
				} catch (IOException e) {
					log.severe("" + e);
				}
			}
		}
	}
}

