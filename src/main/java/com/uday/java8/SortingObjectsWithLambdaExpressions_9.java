package com.uday.java8;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
    int eId;
    String eName;

    public Employee(int eId, String eName) {
        this.eId = eId;
        this.eName = eName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                '}';
    }
}
public class SortingObjectsWithLambdaExpressions_9 {
    public static void main(String args[]){
        ArrayList<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee(100,"Tom"));
        employeeList.add(new Employee(200,"Harry"));
        employeeList.add(new Employee(300,"Dave"));
        employeeList.add(new Employee(150,"Mike"));

        Collections.sort(employeeList,(e1,e2)->(e1.eId<e2.eId)?1:(e1.eId>e2.eId)?-1:0);
        System.out.println("Employee list after sorting in descending order");
        System.out.println(employeeList);
    }
}
