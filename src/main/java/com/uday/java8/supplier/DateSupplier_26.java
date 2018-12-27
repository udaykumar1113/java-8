package com.uday.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class DateSupplier_26 {
    public static void main(String args[]){
        Supplier<Date> dateSupplier=()->new Date();
        System.out.println("Priniting current date "+dateSupplier.get());
    }
}
