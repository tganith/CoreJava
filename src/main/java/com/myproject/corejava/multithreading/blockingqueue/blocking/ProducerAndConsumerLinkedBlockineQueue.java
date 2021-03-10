package com.myproject.corejava.multithreading.blockingqueue.blocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerAndConsumerLinkedBlockineQueue {

    public static void main(String args[]) throws InterruptedException{

        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>(5);

        Thread producer = new Thread(()->{
            try{
                int value = 0;
                while(true){
                    queue.put(value);
                    System.out.println("produce= "+value++);
                    Thread.sleep(1000);
                }
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        });

        Thread consumer = new Thread(()->{
            try{
                while(true){
                    int value = queue.take();
                    System.out.println("consume="+value);
                    Thread.sleep(1000);
                }
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        });

        producer.start();
        consumer.start();


    }
}
