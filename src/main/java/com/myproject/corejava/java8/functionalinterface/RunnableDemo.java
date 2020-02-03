package com.myproject.corejava.java8.functionalinterface;

public class RunnableDemo {

    public static void main(String args[]) {

        Runnable runnable = ()->{
            for(int i =1;i<=10;i++){
                System.out.println("child thread executed ");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        for(int i =1;i<=10;i++){
            System.out.println("main thread executed ");
        }

    }
}
