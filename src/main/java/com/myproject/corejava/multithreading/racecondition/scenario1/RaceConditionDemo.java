package com.myproject.corejava.multithreading.racecondition.scenario1;

public class RaceConditionDemo {

    public static void main(String args[]) {

        Counter c = new Counter();

        Thread t1 = new Thread(c);
        t1.start();

        Thread t2 = new Thread(c);
        t2.start();

        Thread t3 = new Thread(c);
        t3.start();

    }
}
