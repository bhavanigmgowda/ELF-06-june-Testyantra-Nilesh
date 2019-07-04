package com.tyss.javaprogram.filehandling;

import java.io.File;

import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class FIleHandle {
	public static void main(String[] args) {
		File f = new File("file.txt");
		try {
			boolean res = f.createNewFile();

			log.info("" + "result is " + res);

		} catch (IOException e) {
			log.severe("" + e);
		}
	}
}
