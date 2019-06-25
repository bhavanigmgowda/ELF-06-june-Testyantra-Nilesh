package com.tyss.javaprogram.predicate;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class FuntionDemo {
   public static void main(String[] args) {
          Function<Double,Double> f= r->3.14*r*r;
           double x=f.apply(4.4);
           log.info(""+x);
}
}
