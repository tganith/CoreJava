package com.myproject.corejava.java8.lamdbawithcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmployeeSort {

    public static void main(String args[]) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(2,"test"));
        list.add(new Employee(10,"java"));
        list.add(new Employee(1,"jayansh"));
        list.add(new Employee(7,"ganitha"));

        Collections.sort(list,(e1,e2)->e1.getEmpId()>e2.getEmpId()?-1:e1.getEmpId()<e2.getEmpId()?1:0);

        System.out.println(list);

    }
}
