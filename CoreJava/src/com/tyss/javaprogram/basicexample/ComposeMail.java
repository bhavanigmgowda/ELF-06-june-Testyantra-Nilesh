package com.tyss.javaprogram.basicexample;

public class ComposeMail {
	

    String to;
    String from;
    String subject;
    String msg;
    
    void send(String to,String from,String subject,String msg)
    {
   	 System.out.println("To"+to);
   	 System.out.println("From"+from);
   	 System.out.println("subject"+subject);
   	 System.out.println("msg"+msg);
    }

}
