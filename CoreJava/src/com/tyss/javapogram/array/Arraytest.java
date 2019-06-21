package com.tyss.javapogram.array;

import java.util.Scanner;

public class Arraytest {
      
	 public static void main(String[] args) {
         int a[]= {5,6,2,1,4};
         int b[]= {30,40,50,60,70,80};
         Scanner s=new Scanner(System.in);
         System.out.println("enter index");
         int index=s.nextInt();
         System.out.println("enter element");
         int ele=s.nextInt();
        int k=0;
         for (int i =0; i<ele; i++) 
         {
			b[index++]=a[k++];
		 }
         
         for (int i : b) {
			System.out.println(i); 
		}
       
}
}
