package com.myproject.corejava.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {


    public static void main(String args[]) throws InterruptedException{

        ExecutorService service = Executors.newFixedThreadPool(5);


        CountDownLatch latch = new CountDownLatch(3);
        service.submit(new DependentService(latch,1000));
        service.submit(new DependentService(latch,2000));
        service.submit(new DependentService(latch,3000));

        latch.await();

        service.shutdown();

        System.out.println("main thread executed");



    }
}

