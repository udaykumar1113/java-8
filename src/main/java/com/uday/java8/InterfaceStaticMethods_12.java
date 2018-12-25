package com.uday.java8;

interface StaticMethod{
    static void method_1(){
        System.out.println("This is a static method in interface");
    }
}

public class InterfaceStaticMethods_12 implements StaticMethod{
    public static void main(String args[]){
        StaticMethod.method_1();
    }
}
