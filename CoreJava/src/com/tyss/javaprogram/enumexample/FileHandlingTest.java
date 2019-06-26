package com.tyss.javaprogram.enumexample;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingTest {
    public static void main(String[] args) {
    	String a="nilesh";
		byte[] b=a.getBytes();
		
		
    	try(FileOutputStream fos=new FileOutputStream("fileEx")) {  // try resource multiple column
			
			fos.write(b);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	
    	
	}
}
