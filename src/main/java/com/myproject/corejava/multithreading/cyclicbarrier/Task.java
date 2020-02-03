package com.myproject.corejava.multithreading.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable {

    CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier=barrier;
    }

    public void run(){

        while(true) {
            try {
                System.out.println(Thread.currentThread().getName()+" executed");
                Thread.sleep(1000);
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
