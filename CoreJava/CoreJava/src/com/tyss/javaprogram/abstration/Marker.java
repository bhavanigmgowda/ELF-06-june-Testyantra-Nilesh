package com.tyss.javaprogram.abstration;

import lombok.extern.java.Log;

/*
 * marker class
 */
@Log
public class Marker extends Pencil {
    void color()
    {
    	log.info("color method");
    }//end of method
}//end of class
