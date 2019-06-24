package com.tyss.javaprogram.array;

import java.util.Scanner;

import lombok.extern.java.Log;
@Log
public class Array2 {
	 public static void main(String[] args) {
         int a[]= {5,6,2,1,4};
         int b[]= {30,40,50,60,70,80};
         
         @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
         log.info("enter index");
         int index=s.nextInt();
         log.info("enter element");
         int ele=s.nextInt();
         log.info("enter source index");
         int sindex=s.nextInt();
        int k=0;
         for (int i =0; i<ele; i++) 
         {
			b[index++]=a[sindex+k++];
		 }
         
         for (int i : b) {
			log.info(""+i); 
		}
       
}

}
