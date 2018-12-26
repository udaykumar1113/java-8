package com.uday.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class FunctionFindSalaryEmployeeList_21 {
    public static void main(String rags[]){

        Function<List<Employee>,Integer> salaryFunction=s->{
            int total=0;
            for(Employee e:s)
                total=total+e.salary;
            return total;

        };
        System.out.println("Total salary is: "+ salaryFunction.apply(populate()));
    }
    public static ArrayList<Employee> populate(){
        ArrayList<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee("DAVE",10000));
        employeeList.add(new Employee("DOE",15000));
        employeeList.add(new Employee("HARRY",12000));
        return employeeList;
    }
}

