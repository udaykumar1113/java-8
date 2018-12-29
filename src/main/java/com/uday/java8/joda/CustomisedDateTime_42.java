package com.uday.java8.joda;

import java.time.LocalDateTime;
import java.time.Month;

public class CustomisedDateTime_42 {
    public static void main(String args[]){
        LocalDateTime localDateTime=LocalDateTime.of(1996, Month.MAY,10,13,38,55);
        System.out.println(localDateTime);

        //Increase the existing date and time parameters
        System.out.println(localDateTime.plusMonths(1).plusHours(20));
        System.out.println(localDateTime.plusDays(5));
        System.out.println(localDateTime.plusHours(10));
    }
}
