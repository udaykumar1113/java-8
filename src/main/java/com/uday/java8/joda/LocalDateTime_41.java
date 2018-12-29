package com.uday.java8.joda;

import java.time.LocalDateTime;

public class LocalDateTime_41 {
    public static void main(String args[]){
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("Day: "+localDateTime.getDayOfMonth());
        System.out.println("Month: "+localDateTime.getMonth()+" "+localDateTime.getMonthValue());
        System.out.println("Year: "+localDateTime.getYear());

        System.out.println("Hours: "+localDateTime.getHour());
        System.out.println("Minutes: "+localDateTime.getMinute());
        System.out.println("Seconds: "+localDateTime.getSecond());
        System.out.println("Nano: "+localDateTime.getNano());

    }
}
