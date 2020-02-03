package com.myproject.corejava.java8.lamdbawithcollections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LambdaTreeMap {

    public static void main(String args[]) {

        // descending order for Map keys
        Map<Integer,String> map = new TreeMap<>((i1, i2)->(i1<i2)?1:(i1>i2)?-1:0);
        map.put(300,"ganitha");
        map.put(200,"Test");
        map.put(100,"jayansh");
        map.put(500,"java");
        map.put(600,"learning");



        System.out.println(map);
    }
}
