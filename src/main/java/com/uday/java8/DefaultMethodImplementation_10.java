package com.uday.java8;

interface defaultMethodInterf{

    default void defaultMethod(){
        System.out.println("Implementing default method in interface");
    }
}

public class DefaultMethodImplementation_10 implements defaultMethodInterf{

    public static void main(String args[]){
        DefaultMethodImplementation_10 impl=new DefaultMethodImplementation_10();
        impl.defaultMethod();
    }
}
