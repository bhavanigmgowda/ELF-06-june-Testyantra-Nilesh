package com.tyss.javaprogram.log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MAinObjectWrite {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Suresh");
		p.setAge(25);
		FileOutputStream fos =null;
		ObjectOutputStream oos=null;
		try {
			 fos = new FileOutputStream("file1.txt");
		     oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			System.out.println("object Written");
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			   if(fos!=null)
			   {
				   try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   }
			  
		}

	}
}
