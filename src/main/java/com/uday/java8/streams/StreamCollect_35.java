package com.uday.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect_35 {
    public static void main(String args[]){
        ArrayList<String> namesList=new ArrayList<>();
        namesList.add("DAVE");namesList.add("DOE");
        namesList.add("HARRY");namesList.add("POTTER");
        namesList.add("DAVIDSON");namesList.add("JACKSON");

        //Stream to filter names length less than 5 characters
        List<String> filterStream=namesList.stream().filter(I->I.length()<5).collect(Collectors.toList());
        System.out.println(filterStream);

        //Stream of map of strings after converting to upper case
        List<String> mapStream=namesList.stream().map(I->I.toLowerCase()).collect(Collectors.toList());
        System.out.println(mapStream);
    }
}
