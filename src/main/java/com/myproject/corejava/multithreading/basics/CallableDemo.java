package com.myproject.corejava.multithreading.basics;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

    public static void main(String args[]) {

        ExecutorService executors = Executors.newFixedThreadPool(10);

            Future<Integer> future = executors.submit(new CallablePrg());
            try {
                Integer value = future.get();
                System.out.println(value);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            executors.shutdown();
        }
}
