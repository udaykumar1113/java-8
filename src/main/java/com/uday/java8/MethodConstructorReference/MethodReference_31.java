package com.uday.java8.MethodConstructorReference;

interface Interf{
    public void method1();
}
public class MethodReference_31 {

    public static void method2(){
        System.out.println("This method 2 referred from method 1");
    }
    public static void main(String args[]){
        Interf interf=MethodReference_31::method2;
        interf.method1();
    }
}
