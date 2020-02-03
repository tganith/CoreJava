package com.myproject.corejava.multithreading.racecondition;

public class MyThread extends Thread{
    private ThreadDemo demo;

    MyThread(ThreadDemo demo) {
      this.demo = demo;
    }

    public void run(){
        add(10,20);
    }

    public  void add(int num1,int num2) {
        synchronized(demo) {
            this.demo.sum1+=num1;
            this.demo.sum2+=num2;
            System.out.println(demo.sum1);
            System.out.println(demo.sum2);
        }

    }

}
