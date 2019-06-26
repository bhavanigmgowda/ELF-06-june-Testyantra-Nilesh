package com.tyss.javaprogram.encapsulation;
import lombok.extern.java.Log;
@Log
public class Db2 {
	 void data(Person p)
     {
   	  log.info(""+"data saved in db2");
   	 log.info(""+p.getName());
	 log.info(""+p.getAge());
     }

}
