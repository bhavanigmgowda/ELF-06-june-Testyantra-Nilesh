package com.tyss.javaprogram.assignmentfour;

public class Word {
        public static void main(String[] args) {
			  String a="abc def ghi jkl mno";
			    String word[]=a.split(" ");
			  
			  for (int i = 0; i < args.length; i++) 
			  {
				 String temp =word[0];
				 word[0]=word[2];
				 word[2]=temp;
			}
		} 
        
}
