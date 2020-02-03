package com.myproject.corejava.multithreading;

public class DeadLock {
    String s1 = "Test1";
    String s2 = "Test2";

    Thread t1 = new Thread(){
        public void run(){
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
    };

    Thread t2 = new Thread(){
      public void run(){
          synchronized(s2){
                  System.out.println(Thread.currentThread().getName()+" Locked for s2");
              synchronized (s1){
                  System.out.println(Thread.currentThread().getName()+" Locked for s1");
              }
          }
      }
    };

    public static void main(String args[]) {

        DeadLock lock = new DeadLock();
        lock.t1.start();
        lock.t2.start();
    }
}
