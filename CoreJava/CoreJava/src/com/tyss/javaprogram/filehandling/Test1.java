package com.tyss.javaprogram.filehandling;

import java.io.File;
import lombok.extern.java.Log;

@Log
public class Test1 {
	public static void main(String[] args) {
		File f = new File("movies/programfile");
		boolean res = f.mkdirs();

		log.info("result is " + res);
	}
}
