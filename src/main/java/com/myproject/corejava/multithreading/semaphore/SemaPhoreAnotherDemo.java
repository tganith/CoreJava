package com.myproject.corejava.multithreading.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaPhoreAnotherDemo {

    static Semaphore semaPhore = new Semaphore(4);

    public static void main(String args[]) throws InterruptedException{

        System.out.println("Total Available Permits"+semaPhore.availablePermits());

        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i =1;i<=10;i++){
            service.submit(new MyClass());
        }

        service.shutdown();
    }


    static class MyClass implements Runnable{

      public void run() {

          try {
              semaPhore.acquire();
              System.out.println(Thread.currentThread().getName()+" acquired lock");
              System.out.println("Available Permits:"+semaPhore.availablePermits());
              Thread.sleep(1000);

          } catch (InterruptedException e) {
              e.printStackTrace();
          } finally{
              semaPhore.release();
              System.out.println(Thread.currentThread().getName()+" released lock");
              System.out.println("---------------------------------------------------------");
          }


      }


    }

}
