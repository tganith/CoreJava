package com.myproject.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasicOperations {

    public static void main(String args[]) {

        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(30);
        list.add(5);
        list.add(12);
        list.add(10);

        // Findout count of list
        long count = list.stream().count();
        System.out.println("Count:"+count);

        // limit size of List
        List<Integer> limitList = list.stream().limit(2).collect(Collectors.toList());
        System.out.println("Limit:"+limitList);

        // distinct list
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Disinct List"+distinctList);

        // fiter list
        List<Integer> filterList =  list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Filter List"+filterList);

        //map list
        List<Integer>  mapList = list.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Map List:"+mapList);

        List<Integer>  sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List:"+sortedList);

        //using foreach
        list.stream().forEach(System.out::println);


    }
}
