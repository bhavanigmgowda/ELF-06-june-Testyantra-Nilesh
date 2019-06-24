package com.tyss.javaprogram.log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
     public static void main(String[] args) throws IOException, ClassNotFoundException {
	    FileInputStream fis;
		try {
			fis = new FileInputStream("file1.txt");
			 ObjectInputStream ooi=new ObjectInputStream(fis);
			 Person p=(Person)ooi.readObject();
			 System.out.println(p.getAge());
			 System.out.println(p.getName());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
}
