package com.myproject.corejava.multithreading;

import java.util.Random;

public class ThreadLocalDemo  implements Runnable{


    public void run(){
        ThreadLocal local = new ThreadLocal();

        local.set(new Random().nextInt());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(local.get());

    }

    public static void main(String args[]) {

        ThreadLocalDemo local= new ThreadLocalDemo();

        new Thread(local).start();
        new Thread(local).start();

    }
}

