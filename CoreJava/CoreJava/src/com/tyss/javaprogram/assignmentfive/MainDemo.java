package com.tyss.javaprogram.assignmentfive;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.tyss.javaprogram.encapsulation.Person;

import lombok.extern.java.Log;

@Log
public class MainDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("mahesh");
		p.setAge(25);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("file1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			log.info("done ");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			log.severe(" " + e);
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
