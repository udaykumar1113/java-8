package com.uday.java8.BifunctionalInterface;

import java.util.function.BiConsumer;

class Employee{
    int baseSalary;
    String name;

    public Employee(int baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }
}
public class BiConsumerIncrementSalary_30 {
    public static void main(String args[]){
        BiConsumer<Employee, Integer> biConsumer=(employee, increment)
                -> System.out.println("Total salary "+(employee.baseSalary+increment));
        biConsumer.accept(new Employee(4000, "DAVE"),100);

    }
}
