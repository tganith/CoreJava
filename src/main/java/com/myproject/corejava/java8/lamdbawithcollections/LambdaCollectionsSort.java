package com.myproject.corejava.java8.lamdbawithcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaCollectionsSort {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        Collections.sort(list,(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0);


        System.out.println(list);
    }
}
