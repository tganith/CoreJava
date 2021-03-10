package com.myproject.corejava.java8.streams;

import java.lang.annotation.IncompleteAnnotationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedStreams {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(25);
        list.add(50);
        list.add(52);
        list.add(58);

        //default sorting order
        List<Integer> newList =  list.stream().sorted().collect(Collectors.toList());
        //   newList.stream().forEach(System.out::println);

        // asending order
        List<Integer> comparatorList = list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        //  comparatorList.stream().forEach(System.out::println);

        // desending order
        List<Integer> comparatorDesendList = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        comparatorDesendList.stream().forEach(System.out::println);


        int minValue = list.stream().min((i1, i2)->-i1.compareTo(i2)).get();
        System.out.println("minimum value:"+minValue);

        int maxValue = list.stream().max((i1, i2)->-i1.compareTo(i2)).get();
        System.out.println("maximum value:"+maxValue);


       Stream<Integer> list2 = list.stream();


    }
}
