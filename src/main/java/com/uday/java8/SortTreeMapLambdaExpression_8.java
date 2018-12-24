package com.uday.java8;

import java.util.TreeMap;

public class SortTreeMapLambdaExpression_8 {
    public static void main(String args[]){
        TreeMap<Integer, String> map=
                new TreeMap<Integer, String>((I1,I2)->(I1<I2)?1:(I1>I2)?-1:0);
        map.put(300,"Dave");
        map.put(100,"Doe");
        map.put(700,"Walter");
        map.put(400,"Scott");
        map.put(800,"John");
        System.out.println("Desending order is "+map);
    }

}
