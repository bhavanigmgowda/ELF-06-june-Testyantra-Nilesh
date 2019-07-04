package com.tyss.javaprogram.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import lombok.extern.java.Log;

@Log
public class FileHandling {

	public static void main(String[] args) {
		try {
			FileUtils.writeStringToFile(new File("MyFile1.txt"), "This is my file !!",Charset.defaultCharset());
			log.info("file is created");
			
		
		} catch (IOException e) {
			log.severe(""+e);
		}
	}// End of main

}// end of class
