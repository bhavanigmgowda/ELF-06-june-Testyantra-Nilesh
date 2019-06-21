package com.tyss.programfile.inheritance;

public class LevelOne {
	void one()
	{
		System.out.println("method from level one");
	}
}

class LevelTwo extends LevelOne
{
      void two()
      {
    	  System.out.println("method from level two");
      }
}

 class levelthree  extends LevelTwo
 {
	  void three()
	  {
		  System.out.println("method from level three");
	  }
 }