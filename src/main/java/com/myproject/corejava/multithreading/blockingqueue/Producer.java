package com.myproject.corejava.multithreading.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

   private BlockingQueue<Message> queue;

   public Producer(BlockingQueue<Message> queue){
       this.queue = queue;
   }

    @Override
    public void run() {

         try {
               int value = 0;
               while(true){
                   queue.put(new Message(value));
                   System.out.println("produced message"+value++);
                   Thread.sleep(1000);
               }

           } catch (InterruptedException e) {
               e.printStackTrace();
           }
   }
}
