package com.tyss.javaprogram.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import lombok.extern.java.Log;

@Log
public class Writing {
	public static void main(String[] args) {
		String a = "dam dam diga diga";
		char[] ch = a.toCharArray();
		FileWriter fw = null;
		try {
			fw = new FileWriter("poem.txt");
			fw.write(ch);
			fw.flush();
			fw.close();
			log.info("done");
		} catch (IOException e) {
			log.severe("" + e);
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					log.severe("" + e);
				}
			}
		}

	}
}
