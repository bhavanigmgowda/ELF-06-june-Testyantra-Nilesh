package com.tyss.javaprogram.stream;

import lombok.extern.java.Log;

@Log
public class TestB {
  public static void main(String[] args) {
	
	    Demo a=x->log.info(""+x);   // lamda expression
	    
	    a.print(45);
	    
	    Pen p=new Pen();
	    Demo d=p::write;  // method reference
	    d.print(58);
}
  
 
}
@Log
class Pen
{
	  void write(int x)
	  {
		  log.info(""+x);
	  }
}