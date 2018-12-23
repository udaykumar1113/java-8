package com.uday.java8;

@FunctionalInterface
interface interf4{
    public int squareIt(int x);
}
public class SquareofaNumber_4 {
    public static void main(String args[]){
        interf4 interfaceRef=x->x*x;
        System.out.println("Square of 25 is "+interfaceRef.squareIt(25));
    }
}
