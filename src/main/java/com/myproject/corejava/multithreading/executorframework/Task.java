package com.myproject.corejava.multithreading.executorframework;

public class Task implements Runnable {

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
