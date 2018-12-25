package com.uday.java8.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateCollection_14 {
    public static void main(String args[]){

        //Find if a collection contains objects
        ArrayList<String> stringList=new ArrayList<>();
        Predicate<Collection> p= str->str.isEmpty();
        System.out.println(p.test(stringList));
        stringList.add("TEST STRING");
        System.out.println(p.test(stringList));

        //Find if string length is greater than 5
        String testString="PREDICATE";
        Predicate<String> t=str->str.length()>5;
        System.out.println(t.test(testString));
    }
}
