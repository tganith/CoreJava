package com.myproject.corejava.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public  static void main(String args[]) {

      /*  Map<Integer,Integer> map = new HashMap<>();
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
       }*/

        Map<Integer,Integer> map = new ConcurrentHashMap<>();
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
        }


    }

}
