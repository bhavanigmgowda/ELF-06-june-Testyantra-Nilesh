package com.tyss.javaprogram.assignmentfour;

import java.util.Scanner;

import lombok.extern.java.Log;
@Log
public class ReverseWord {

    public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 log.info("enter sentence");
		 String sen=s.nextLine();
		 char ch[]=sen.toCharArray();
		 for (int i =ch.length-1; i>=0; i--) {
			 log.info(""+ch[i]);
			
		}
		 s.close();
	}

}
