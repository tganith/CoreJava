package com.myproject.corejava.multithreading.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String args[]) {

        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i=1;i<=20;i++){
            service.submit(new Task());
        }
        System.out.println("main method executed:"+Thread.currentThread().getName());
        service.shutdown();

    }
}
