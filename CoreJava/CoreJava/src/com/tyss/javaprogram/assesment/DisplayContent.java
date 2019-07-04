package com.tyss.javaprogram.assesment;

import java.util.function.Consumer;

import lombok.extern.java.Log;
@Log
public class DisplayContent {
      
	 Consumer<Product> consumer=(i)->{
		       log.info(""+i.name);
		       log.info(""+i.price);
	 };
}
