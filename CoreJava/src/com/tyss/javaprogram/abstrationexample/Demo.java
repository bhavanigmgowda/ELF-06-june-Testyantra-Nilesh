package com.tyss.javaprogram.abstrationexample;
/*
 * main class for gmail
 */
public class Demo {
   public static void main(String[] args) {
	   Gmail g=new Gmail();
	   Browser b=new Browser();
	   b.open(g);
	   
	   GDrive gd=new GDrive();
	   b.open(gd);
	
	   
} // end of method
}  //end of class
