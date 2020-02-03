package com.myproject.corejava.multithreading.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {


    public static void main(String args[]) {

     ExecutorService service = Executors.newFixedThreadPool(5);

        CyclicBarrier barrier = new CyclicBarrier(3);

        service.submit(new Task(barrier));
        service.submit(new Task(barrier));
        service.submit(new Task(barrier));

        System.out.println("main method executed");



    }
}

