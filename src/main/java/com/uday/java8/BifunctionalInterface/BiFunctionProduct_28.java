package com.uday.java8.BifunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionProduct_28 {
    public static void main(String args[]){
        BiFunction<Integer, Integer, Integer> biFunction=(a,b)->a*b;
        System.out.println("5*25 "+biFunction.apply(5,20));
        System.out.println("7*35 "+biFunction.apply(7,35));
    }
}
