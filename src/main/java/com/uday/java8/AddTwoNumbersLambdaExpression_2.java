package com.uday.java8;

@FunctionalInterface
interface interf1{
    public void add(int number_1, int number_2);
}
public class AddTwoNumbersLambdaExpression_2 {

    public static void main(String args[]){
        interf1 interfaceRef=(number_1, number_2)
                ->System.out.println("Sum is: "+(number_1+number_2));

        interfaceRef.add(10,20);
        interfaceRef.add(100,200);
    }
}
