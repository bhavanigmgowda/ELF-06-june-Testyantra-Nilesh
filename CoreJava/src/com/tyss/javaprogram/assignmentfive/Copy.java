package com.tyss.javaprogram.assignmentfive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class Copy {

public static void main(String[] args) {
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
			fos=new FileOutputStream("File2.txt");
			fis=new FileInputStream("File1.txt");
			
			int c;
			while((c=fis.read())!=-1)
			{
				fos.write((char)c);
			}
			 log.info("copied");
		} catch (FileNotFoundException e) {
			log.severe(""+e);
		} catch (IOException e) {
			log.severe(""+e);
		}
		finally {
			  try {
				  if(fos!=null) {
					  fos.close();
				  }
				  
				
			} catch (IOException e) {
				log.severe(""+e);
			}
		}
		try {
			 if(fis!=null) {
				 fis.close();
			  }
			  
			
		} catch (IOException e) {
			log.severe(""+e);
		}
	}


}
