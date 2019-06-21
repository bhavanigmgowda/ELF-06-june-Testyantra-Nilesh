package com.tyss.javaprogram.pattern;

public class SwapString {
   public static void main(String[] args) {
      String a="Abc def grh ijk lnn";
      
      String arr[]=a.split(" ");
      
     for (String string : arr) 
     {
		System.out.print(string+" ");
	}
      System.out.println();
      for (int i = 0; i <3; i++) 
      {
		 if(i%2!=0)
		 {
			 String temp=arr[0];
			 String mid=arr[(arr.length-1)/2];
			 arr[0]=arr[arr.length-1];
			 arr[arr.length/2]=temp;
			 arr[arr.length-1]=mid;
             
		 }
		
	 }
      for (String string : arr) {
		System.out.print(string+" ");
	}
}
}
