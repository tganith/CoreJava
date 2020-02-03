package com.myproject.corejava.multithreading.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {

    public static void main(String args[]) {

        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(1);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Producer producer1 = new Producer(queue);

        new Thread(producer).start();
        new Thread(producer1).start();


    }
}
