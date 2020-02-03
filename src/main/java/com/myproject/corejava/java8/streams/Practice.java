package com.myproject.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {


    public static void main(String args[]) {


        Integer[] sortedArray = {7,6,5,4,3,2,1};

        List<Integer> newSortedArray = Stream.of(sortedArray).sorted().collect(Collectors.toList());
        System.out.println(newSortedArray);

      /*  List<Employee> employeeList = Stream.of(new Employee(100,"ganitha"),new Employee(50,"jayansh")).sorted((e1,e2)->e1.compareTo(e2)).collect(Collectors.toList());
        employeeList.forEach(System.out::println);*/


    }
}
