package com.myproject.corejava.multithreading.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SemaPhoreDemo {

    public static void main(String args[]) throws InterruptedException{
        Semaphore semaphore = new Semaphore(3);
        ExecutorService service = Executors.newFixedThreadPool(50);
        IntStream.of(1000).forEach(i->service.execute(new Task(semaphore)));
        service.shutdown();
       // service.awaitTermination(1, TimeUnit.MINUTES);
    }

     static class Task implements Runnable{

        Semaphore semaphore;

        public Task(Semaphore semaphore){
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("Executed ---"+"Available Permits"+semaphore.availablePermits());
        //        Thread.sleep(1000);
                semaphore.release();

            }catch (Exception ex){
                ex.printStackTrace();
            }
        }


     }
}
