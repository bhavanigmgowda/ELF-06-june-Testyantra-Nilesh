package com.tyss.javaprogram.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import lombok.extern.java.Log;

@Log
public class ReadFile {
	public static void main(String[] args) {

		try {

			String file = FileUtils.readFileToString(new File("MyFile.txt"), Charset.defaultCharset());
			log.severe(file);
		} catch (IOException e) {
			log.severe("" + e);
		}
	}
}
