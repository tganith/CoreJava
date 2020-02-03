package com.myproject.corejava.practice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

    public static void main(String args[]){

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);


        Thread producer = new Thread(()->{
            int value = 0;
            while(true){
                try {
                    queue.put(value);
                    System.out.println("producer produce message "+value++);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(()->{
            while(true){
                try{
                    int value = queue.take();
                    System.out.println("consumer consume message "+value);
                    Thread.sleep(1000);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();




    }
}
