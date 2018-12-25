package com.uday.java8.predicate;

import java.util.function.Predicate;

public class FindNamesStartingD_16 {
    public static void main(String args[]){

        String names[]={"DAVE", "DOE", "JAMES", "HARRY", "DAVID", "TOM", "DICKSON"};
        Predicate<String> predicate=s->s.charAt(0)=='D';
        for(String str: names)
            System.out.println(str+ " starts with D? "+predicate.test(str));
    }
}
