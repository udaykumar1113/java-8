package com.uday.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FindNullValesInList_17 {
    public static void main(String args[]){
        ArrayList<String> namesList=new ArrayList<>();
        namesList.add("DAVE");
        namesList.add(null);
        namesList.add("DOE");
        namesList.add("");
        namesList.add(null);
        System.out.println("List without modification "+namesList);
        Predicate<String> predicate_1=s->s!=null;
        Predicate<String> predicate_2=s->s.length()!=0;
        eval(predicate_1.and(predicate_2),namesList);
    }

    public static void eval(Predicate<String> predicate, ArrayList<String> namesList){
        System.out.println("After applying predicate");
        for(String name:namesList){
            if(predicate.test(name))
                System.out.println(name);
        }
        //System.out.println("List after applying predicate "+namesList);
    }
}
