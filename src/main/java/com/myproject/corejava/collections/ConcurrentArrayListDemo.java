package com.myproject.corejava.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentArrayListDemo {

    public  static void main(String args[]) {

       List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(30);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int x = iterator.next();
            if(x == 20){
                list.remove(x);
            }
            System.out.println(x);
        }

        /*Map<Integer,Integer> map = new ConcurrentHashMap<>();
        map.put(10,100);
        map.put(20,100);
        map.put(30,100);
        map.put(40,100);



        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            int x = iterator.next();
            if(x == 20){
                map.remove(x);
            }
            System.out.println(x);
        }*/


    }

}
