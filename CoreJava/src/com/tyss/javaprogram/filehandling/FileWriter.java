package com.tyss.javaprogram.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import lombok.extern.java.Log;

@Log
public class FileWriter {
   public static void main(String[] args) {
	 
	   try {
		FileReader fr=new FileReader("file.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			log.info(""+((char)i));
		}
		fr.close();
	} catch (FileNotFoundException e) {
		log.info(""+e);
	} catch (IOException e) {
		log.info(""+e);
	}
	   
}
}
