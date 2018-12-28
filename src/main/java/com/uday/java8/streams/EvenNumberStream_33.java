package com.uday.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberStream_33 {
    public static void main(String args[]){
        ArrayList<Integer> numberList=new ArrayList<Integer>();
        numberList.add(13);numberList.add(4);
        numberList.add(7);numberList.add(-3);
        numberList.add(8);numberList.add(6);
        numberList.add(10);numberList.add(33);

        List<Integer> evenList= numberList.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
