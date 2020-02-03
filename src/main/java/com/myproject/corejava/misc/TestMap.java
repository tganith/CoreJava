package com.myproject.corejava.misc;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestMap {



    public static void main(String args[]) {

      Map<String,Integer> map = new Hashtable<>();
        map.put("king",100);
        map.put("king",200);

     /*   map.put(null,400);
        map.put(null,500);
        System.out.println(map.get(null));*/
        System.out.println(map.get(null));

    }
}
