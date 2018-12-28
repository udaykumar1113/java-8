package com.uday.java8.streams;

import java.util.ArrayList;

public class StreamsforEach_38 {
    public static void main(String args[]){

        ArrayList<String> namesList=new ArrayList<>();
        namesList.add("JOHN"); namesList.add("DOE"); namesList.add("DAVID");
        namesList.stream().forEach(I->System.out.println(I));
    }
}
