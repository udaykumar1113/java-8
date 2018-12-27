package com.uday.java8.BifunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateEvenNumber_27 {
    public static void main(String args[]){

        BiPredicate<Integer, Integer> biPredicate=(a,b) -> (a+b)%2==0;
        System.out.println("Sum of 10 and 15 is even? "+biPredicate.test(10, 15));
    }
}
