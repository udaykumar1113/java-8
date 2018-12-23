package com.uday.java8;

@FunctionalInterface
interface interf2{
    public int getLength(String s);
}

public class ReturnLengthOfStrings_3 {
    public static void main(String args[]){

        //If we are returning then compiler do not need return specified explicitly
        interf2 interfaceRef=(str)->str.length();

        System.out.println("The length of AEROPLANE is "+interfaceRef.getLength("AEROPLANE"));
        System.out.println("The length of EXPRESSIONS is "+interfaceRef.getLength("EXPRSSIONS"));
    }
}
