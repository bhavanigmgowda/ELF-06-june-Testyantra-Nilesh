package com.tyss.javaprogram.encapsulation;
import lombok.extern.java.Log;
@Log
public class Db1 {
      void data(Person p)
      {
    	  log.info(""+"data saved in db1");
    	  log.info(""+p.getName());
    	 log.info(""+p.getAge());
      }
}
