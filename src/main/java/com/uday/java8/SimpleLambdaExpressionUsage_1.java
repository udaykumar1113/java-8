package com.uday.java8;

interface interf{
    public void display();
}
public class SimpleLambdaExpressionUsage_1 {
    public static void main(String args[]){
        interf interfReference=()->System.out.println("Used Lambda Expression");
        interfReference.display();
    }
}
