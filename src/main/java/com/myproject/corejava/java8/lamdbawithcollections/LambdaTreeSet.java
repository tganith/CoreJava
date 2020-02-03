package com.myproject.corejava.java8.lamdbawithcollections;

import java.util.*;

public class LambdaTreeSet {

    public static void main(String args[]) {

        // descending order for tree set
        Set<Integer> list = new TreeSet<>((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
    }
}
