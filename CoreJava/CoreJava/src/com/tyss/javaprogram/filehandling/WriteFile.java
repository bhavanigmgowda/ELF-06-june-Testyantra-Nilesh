package com.tyss.javaprogram.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
/*
 * Write the data in to object
 */
public class WriteFile {

	public static void main(String[] args) {
		String msg = "Hi... good evening";
		byte[] b = msg.getBytes();
		FileOutputStream f = null;
		try {
			f = new FileOutputStream("msg.txt");
			 f.write(b);
		} catch (IOException e) {

			log.severe("" + e);
		}

		finally {
			try {
				if (f != null) {
					f.close();
				}

			} catch (IOException e) {
				log.severe("" + e);
			}
		}

	}// end of method

}// end of class
