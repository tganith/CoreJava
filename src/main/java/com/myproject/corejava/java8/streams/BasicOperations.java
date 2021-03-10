package com.myproject.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicOperations {


    public static void main(String args[]) {


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(5);
        list.add(8);
        list.add(6);


        int sum = list.stream().filter(i->i>10).mapToInt(i->i).sum();
        System.out.println(sum);
    }
}
