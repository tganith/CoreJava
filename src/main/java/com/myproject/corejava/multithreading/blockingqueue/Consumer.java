package com.myproject.corejava.multithreading.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
          while(true){
              try {
                  Message message = (Message)queue.take();
                  System.out.println("Consumer consume messages ......."+message.getMessage());
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        }
}
