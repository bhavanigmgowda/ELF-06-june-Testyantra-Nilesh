package com.tyss.programfile.inheritance;

public class MainPen
{
    public static void main(String[] args) 
    {
	      Pen p=new Marker();
	      p.cost=50;
	      p.write();
	      // p.color();  with parent class reference we can access only parent specific member
	      
	     Marker m=new Marker();
	     m.write();
	     m.color();
	     
	     Pen pe=new Pen();
	     p.write();
	      
	}
}
