package com.tyss.javaprogram.constructor;
import lombok.extern.java.Log;
@Log
public class AcContructor {
	AcContructor(int a)
      {
         log.info(""+"taking int parameter");	  
      }
	AcContructor(double d)
	{
		log.info(""+"taking double parameter");
	}
}
