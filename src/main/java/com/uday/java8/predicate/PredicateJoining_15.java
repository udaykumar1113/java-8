package com.uday.java8.predicate;

import java.util.function.Predicate;

public class PredicateJoining_15 {
    public static void main(String args[]) {

        int x[] = {13, 12, 7, 6, 22, 27, 30};
        Predicate<Integer> predicate_1 = number_1 -> number_1 > 15;
        Predicate<Integer> predicate_2 = number_2 -> number_2 % 2 == 0;

        System.out.println("Numbers less than 15 are");
        eval(predicate_1.negate(), x);

        System.out.println("Numbers greater than 15 and even are");
        eval(predicate_1.and(predicate_2), x);

        System.out.println("Numbers greater than 15 or even are");
        eval(predicate_1.or(predicate_2), x);

        System.out.println("Numbers that are even");
        eval(predicate_2,x);
    }
    public static void eval(Predicate<Integer> predicate, int x[]){

        for(int i:x){
            System.out.println(i+" "+predicate.test(i));
        }
    }
}
