package com.myproject.corejava.multithreading.basics;

public class ThreadDemo {

    public static void main(String args[]) {

        ThreadPrg threadPrg = new ThreadPrg();
        threadPrg.start();


       /* int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);*/
    }
}
