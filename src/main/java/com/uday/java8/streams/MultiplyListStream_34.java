package com.uday.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyListStream_34 {
    public static void main(String args[]){
        ArrayList<Integer> numberList=new ArrayList<Integer>();
        numberList.add(13);numberList.add(4);
        numberList.add(7);numberList.add(-3);
        numberList.add(8);numberList.add(6);
        numberList.add(10);numberList.add(33);

        List<Integer> multiplicationList=numberList.stream().map(I->I*2).collect(Collectors.toList());
        System.out.println(multiplicationList);
    }
}
