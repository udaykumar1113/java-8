package com.uday.java8.joda;

import java.time.LocalDate;
import java.time.LocalTime;

public class IndividualDateTime_40 {
    public static void main(String args[]){
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();

        System.out.println("Month: "+date.getMonth());
        System.out.println("Day: "+date.getDayOfMonth());
        System.out.println("Year: "+date.getYear());

        System.out.println("Hour "+time.getHour());
        System.out.println("Minutes "+time.getMinute());
        System.out.println("Seconds "+time.getSecond());
        System.out.println("Nano seconds "+time.getNano());
    }
}
