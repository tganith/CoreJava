package com.myproject.corejava.multithreading.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CPUIntensiveTaskDemo {

    public static void main(String args[]) {

        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("core size:"+coreCount);

        ExecutorService service = Executors.newFixedThreadPool(coreCount);
        for(int i=1;i<=20;i++){
            service.submit(new Task());
        }
        System.out.println("main method executed:"+Thread.currentThread().getName());
        service.shutdown();

    }
}
