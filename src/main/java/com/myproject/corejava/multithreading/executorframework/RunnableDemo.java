package com.myproject.corejava.multithreading.executorframework;

public class RunnableDemo implements  Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]) {

        for(int i =1;i<=20;i++){
            Thread thread = new Thread(new RunnableDemo());
            thread.start();
        }
        System.out.println("main method executed:"+Thread.currentThread().getName());
    }
}
