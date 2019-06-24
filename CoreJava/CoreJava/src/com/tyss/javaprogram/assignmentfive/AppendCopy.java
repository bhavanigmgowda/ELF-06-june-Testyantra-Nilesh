package com.tyss.javaprogram.assignmentfive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class AppendCopy {
  
public static void main(String[] args) {
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try {
			fos=new FileOutputStream("File2.txt",true);
			fis=new FileInputStream("File1.txt");
			
			int c;
			while((c=fis.read())!=-1)
			{
				fos.write((char)c);
			}
			log.info(" Append copied");
		} catch (FileNotFoundException e) {
			 log.severe(""+e);
		} catch (IOException e) {
		     log.severe(""+e);
		}
		finally {
			  try {
				  if(fis!=null)
					 {
					  fos.close();
					 }
				
			} catch (IOException e) {
				log.severe(""+e);
			}
		}
		try {
			 if(fis!=null)
			 {
				 fis.close();
			 }
			
		} catch (IOException e) {
			log.severe(""+e);
		}
	}

}
