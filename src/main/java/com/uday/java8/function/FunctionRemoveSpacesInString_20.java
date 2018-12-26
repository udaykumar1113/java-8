package com.uday.java8.function;

import java.util.function.Function;

public class FunctionRemoveSpacesInString_20 {
    public static void main(String args[]){
        Function<String, String> function= s->s.replaceAll(" ","");
        System.out.println("This is a line: "+function.apply("This is a line"));
    }
}
