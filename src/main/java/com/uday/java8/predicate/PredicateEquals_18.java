package com.uday.java8.predicate;

import java.util.function.Predicate;

public class PredicateEquals_18 {

    public static void main(String args[]){
        Predicate<String> predicate=Predicate.isEqual("TEST");
        System.out.println(predicate.test("TEST"));
    }
}
