package com.uday.java8;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpressionSortingCompare_7 {
    public static void main(String args[]){
        ArrayList<Integer> integerList=new ArrayList<Integer>();
        integerList.add(10);
        integerList.add(5);
        integerList.add(-6);
        integerList.add(8);
        integerList.add(4);
        System.out.println("Before sorting: "+integerList);
        Collections.sort(integerList, (I1,I2)->(I1<I2)? 1: (I1>I2)? -1: 0);
        System.out.println("After sorting: "+integerList);
    }
}
