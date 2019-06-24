package com.tyss.javaprogram.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import lombok.extern.java.Log;

@Log
public class ReadData {
    public static void main(String[] args) {
    	FileInputStream fis=null;
		try {
			fis=new FileInputStream("file.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				log.info(""+((char)i));
			}
			
		} catch (IOException e) {
			log.info(""+e);
		} 
		finally {
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
}
