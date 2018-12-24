package com.uday.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class DesendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer s1, Integer s2) {
        return (s1<s2)? 1: (s1>s2)? -1:0;
    }
}

public class SortingWithComprator_6 {
    public static void main(String args[]){

        ArrayList<Integer> integerList=new ArrayList<Integer>();
        integerList.add(10);
        integerList.add(5);
        integerList.add(-6);
        integerList.add(8);
        integerList.add(4);
        DesendingComparator desendingComparator=new DesendingComparator();
        Collections.sort(integerList,desendingComparator);
        System.out.println(integerList);
    }
}
