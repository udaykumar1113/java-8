package com.uday.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting_37 {
    public static void main(String args[]){
        ArrayList<Integer> integerList=new ArrayList<>();
        integerList.add(5);integerList.add(-3);integerList.add(7);
        integerList.add(-1);integerList.add(2);integerList.add(4);

        List<Integer> ascendingOrder= integerList.stream().sorted().collect(Collectors.toList());
        System.out.println("Natural sorting order is "+ascendingOrder);

        List<Integer> dscendingOrder= integerList.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList());
        System.out.println("Descending sorting order is "+dscendingOrder);
    }
}
