package com.tyss.javaprogram.abstration;

import lombok.extern.java.Log;

@Log
     public abstract class Pencil extends Pen {
   void write()
   {
	   log.info("write method");
   }

}
