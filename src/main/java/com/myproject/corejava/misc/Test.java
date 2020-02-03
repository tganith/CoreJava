package com.myproject.corejava.misc;

import java.util.Optional;

public class Test implements Runnable{

    public void run() {
        System.out.println("running");
    }

    public static void main(String args[]) {

        String s = "4.5x4.a.3";
        String[]  tokens = s.split("\\s");
        for(String o : tokens ){
           System.out.print(o+" ");
        }
        System.out.print(" ");

        tokens = s.split("\\..");

        for(String o : tokens ){
            System.out.print(o+" ");
        }


    }
}
