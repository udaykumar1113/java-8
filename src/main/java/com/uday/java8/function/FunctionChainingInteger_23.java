package com.uday.java8.function;

import java.util.function.Function;

public class FunctionChainingInteger_23 {
    public static void main(String args[]){
        Function<Integer, Integer> f1=s->s+s;
        Function<Integer, Integer> f2=s->s*s*s;
        System.out.println("Applying default method andThen: "+f1.andThen(f2).apply(5));
        System.out.println("Applying default method compose: "+f1.compose(f2).apply(5));
    }
}
