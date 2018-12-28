package com.uday.java8.streams;

import java.util.ArrayList;

public class StreamCount_36 {
    public static void  main(String args[]){
        ArrayList<String> namesList=new ArrayList<>();
        namesList.add("DAVE");namesList.add("DOE");
        namesList.add("HARRY");namesList.add("POTTER");
        namesList.add("DAVIDSON");namesList.add("JACKSON");

        Long count=namesList.stream().filter(I->I.length()<5).count();
        System.out.println("The count of names where the length is less than 5 is: "+count);
    }
}
