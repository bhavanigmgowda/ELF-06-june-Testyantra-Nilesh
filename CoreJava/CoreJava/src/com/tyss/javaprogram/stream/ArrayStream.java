package com.tyss.javaprogram.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class ArrayStream {
   public static void main(String[] args) {
      Integer a[]= {5,7,8,9};
      
      Stream s=Stream.of(a);
      
      s.forEach(i->log.info(""+i));
}
}
