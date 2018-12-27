package com.uday.java8.BifunctionalInterface;

import java.util.function.BiFunction;

class Student{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

public class BiFunctionStudent_29 {
    public static void main(String args[]){

        BiFunction<String, Integer, Student> biFunction=(name, id)->new Student(name,id);
        System.out.println(biFunction.apply("DAVE",100));
        System.out.println(biFunction.apply("HARRY",200));
    }
}
