package com.uday.java8.predicate;

import java.util.function.Predicate;

public class PredicateTest_13 {
    public static void main(String args[]){
        Predicate<Integer> predicate=number->number>10;
        System.out.println(predicate.test(100));
        System.out.println(predicate.test(3));
    }
}
