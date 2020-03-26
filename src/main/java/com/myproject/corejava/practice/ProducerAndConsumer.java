package com.myproject.corejava.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerAndConsumer {

    public  static void main(String args[]){


        BlockingQueue<Integer> queue = new ArrayBlockingQueue(5);

        Thread p = new Thread(()->{
            int value = 0;
            while(true){
                try {
                    queue.put(value++);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("produced value:"+value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread c = new Thread(()->{
            while(true){
                int value = 0;
                try {
                    value = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("consumed value:"+value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });


        p.start();
        c.start();

    }

}
