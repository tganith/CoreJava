package com.myproject.corejava.multithreading;

public class DeadLock1 {
    String s1 = "Test1";
    String s2 = "Test2";

    Thread t1 = new Thread(
            ()->{
                synchronized (s1){
                    System.out.println(Thread.currentThread().getName()+" Locked for s1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2){
                        System.out.println(Thread.currentThread().getName()+" Locked for s2");
                    }
                }
            }


    );

    Thread t2 = new Thread(
            ()->{
                synchronized (s2){
                    System.out.println(Thread.currentThread().getName()+" Locked for s2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s1){
                        System.out.println(Thread.currentThread().getName()+" Locked for s1");
                    }
                }
            }


    );

    public static void main(String args[]) {

        DeadLock1 lock = new DeadLock1();
        lock.t1.start();
        lock.t2.start();
    }
}
