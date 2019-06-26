package com.tyss.javaprogram.encapsulation;
import lombok.extern.java.Log;
@Log
public class DataBase2 {
	void getInfo(Empolyee e)
	{
		log.info(""+""+"Name "+e.getName());
		log.info(""+""+"Gender "+e.getGender());
		log.info(""+""+"Age ="+e.getAge());
	}
}
