package com.myproject.corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfDemo {

    public static void main(String args[]) {


        // passing group values
        Stream<Integer>  list = Stream.of(10,20,30,40);
        list.forEach(System.out::println);

        System.out.println("------------------------");

        // passing array
        Integer[] array = {10,20,30,1,5};
        Stream<Integer>  arrayStream = Stream.of(array);
      //  arrayStream.forEach(System.out::println);

        Stream.of(array).forEach(s->System.out.println(s));


    }
}
