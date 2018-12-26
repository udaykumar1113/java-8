package com.uday.java8.function;

import java.util.function.Function;

public class FunctionStringLength_19 {
    public static void main(String args[]){

        Function<String, Integer> function=s->s.length();
        System.out.println("The length of TOAST is: "+function.apply("TOAST"));
        System.out.println("The length of AEROPLANE is: "+function.apply("AEROPLANE"));
    }
}
