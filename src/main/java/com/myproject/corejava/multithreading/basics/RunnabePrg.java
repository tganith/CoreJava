package com.myproject.corejava.multithreading.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class
RunnabePrg implements Runnable{
    public void run() {

        Map<Integer,String> map = new HashMap<>();

        int key = 0;
        while(true){

            map.put(key++,""+key);

            System.out.println("run method executed");
           /* try {
                Thread.sleep(2000);
            }catch(Exception ex){

            }*/
        }

    }
}
