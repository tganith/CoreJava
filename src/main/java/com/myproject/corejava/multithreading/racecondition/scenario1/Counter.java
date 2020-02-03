package com.myproject.corejava.multithreading.racecondition.scenario1;

public class Counter implements Runnable{

    int count =0;

    public void run() {
        increment();
        System.out.println(Thread.currentThread().getName()+":"+getValue());

        decrement();
        System.out.println(Thread.currentThread().getName()+":"+getValue());
    }

    public void increment(){
        ++count;
    }

    public void decrement(){
        --count;
    }

    public int getValue(){
        return count;
    }


}
