package com.myproject.corejava.multithreading.basics;

public class RunnableDemo {

    public static void main(String args[]) {

        Thread thread = new Thread(new RunnabePrg());
        thread.start();
    }

}
