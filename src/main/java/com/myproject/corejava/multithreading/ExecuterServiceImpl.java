package com.myproject.corejava.multithreading;


public class ExecuterServiceImpl {


    public static void main(String args[]) {

        int count = Runtime.getRuntime().availableProcessors();

        System.out.println(count);

    }

}
