package com.tyss.javaprogram.assignmentfour;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class WordReverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 log.info("enter the word");
		String a=s.nextLine();
		String ab[]=a.split(" ");
		for (int i = 0; i < ab.length; i++) {
		}
		for(int i=0;i<ab.length;i++)
		{
		   
		   char ch[]=ab[i].toCharArray();
		  
		   for(int j=ch.length-1;j>=0;j--)
		   {
			   log.info(""+ch[j]);
		   }
		   log.info("");
		   
		}
		s.close();
	}


}
