package com.myproject.corejava.multithreading.racecondition;

public class ThreadDemo {

    public int sum1 = 0 ;
    public int sum2 = 0;

    public static void main(String args[]) {

        ThreadDemo demo = new ThreadDemo();
        MyThread t1 = new MyThread(demo);
        MyThread t2 = new MyThread(demo);

        t1.start();
        t2.start();
    }
}
