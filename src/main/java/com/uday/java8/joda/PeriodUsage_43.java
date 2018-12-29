package com.uday.java8.joda;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodUsage_43 {
    public static void main(String args[]){

        LocalDate birthDate=LocalDate.of(1994, Month.JUNE,24);
        LocalDate todayDate=LocalDate.now();

        Period period= Period.between(birthDate, todayDate);
        System.out.println(period.getDays()+" "+period.getMonths()+" "+period.getYears());
    }
}
