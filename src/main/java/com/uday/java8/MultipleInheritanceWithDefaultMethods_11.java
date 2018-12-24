package com.uday.java8;

interface Left{
    default void method_1(){
        System.out.println("Left interface default method");
    }
}

interface Right{
    default void method_1(){
        System.out.println("Right interface default method");
    }
}

public class MultipleInheritanceWithDefaultMethods_11 implements Left,Right{
    @Override
    public void method_1() {
        System.out.println("Overrided default method to resolve conflict");
        Left.super.method_1();
    }
    public static void main(String args[]) {
        MultipleInheritanceWithDefaultMethods_11 m=new MultipleInheritanceWithDefaultMethods_11();
        m.method_1();
    }
}
