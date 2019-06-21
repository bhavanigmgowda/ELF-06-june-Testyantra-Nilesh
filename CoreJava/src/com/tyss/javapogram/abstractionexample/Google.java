package com.tyss.javapogram.abstractionexample;

abstract  public class Google {
       void login()
       {
    	   System.out.println("login ");
       }
       abstract void sharedDocument();
       
    	  
      
} 
  class Gmail extends Google{

	void sharedDocument() {
		System.out.println("share with gmail ");
	}
	  
  }
  
  class GDrive extends Google
  {

	void sharedDocument() {
		System.out.println("share with GDrive");
	}
	  
  }
