package com.uday.java8.joda;

import java.time.Year;

public class LeapYearUsage_44 {
    public static void main(String args[]){
        boolean leapYear= Year.isLeap(1994);
        System.out.println("Is 1994 leap year? "+leapYear);
    }
}
