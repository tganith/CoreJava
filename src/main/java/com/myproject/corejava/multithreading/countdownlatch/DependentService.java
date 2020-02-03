package com.myproject.corejava.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class DependentService implements Runnable {

    CountDownLatch latch;
    int sleepTime;

    public DependentService(CountDownLatch latch,int sleepTime){
        this.latch = latch;
        this.sleepTime =sleepTime;
    }

    @Override
    public void run() {


        try{
            Thread.sleep(sleepTime);
            System.out.println(Thread.currentThread().getName()+ " executed.");

            latch.countDown();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
