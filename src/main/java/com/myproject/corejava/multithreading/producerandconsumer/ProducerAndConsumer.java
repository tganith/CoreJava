package com.myproject.corejava.multithreading.producerandconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerAndConsumer {


    public static void main(String args[]) {
        Buffer buffer = new Buffer(2);


        Thread  producerThread = new Thread(()->{
            try {
                buffer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        Thread consumerThread = new Thread(()->{
                try {
                    buffer.consumer();
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        );

        producerThread.start();
        consumerThread.start();

    }

    static class Buffer{
        int size;
        Queue<Integer> queue;
        Buffer(int size){
            this.size= size;
            queue = new LinkedList<>();
        }

        public void produce() throws InterruptedException{
            int value= 0 ;
            while(true){
                synchronized (this){
                    if(size <= queue.size()){
                        wait();
                    }

                    queue.add(value);
                    System.out.println("produced= "+value);
                    value++;

                    notify();
                    Thread.sleep(1000);
               }
            }
        }

        public void consumer() throws InterruptedException {
            while(true){

                synchronized (this){
                    if(queue.size() == 0){
                        wait();
                    }

                    int value = queue.poll();
                    System.out.println("Consume= "+value);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }


    }
}
