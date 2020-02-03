package com.myproject.corejava.practice;

public class RaceCondition implements Runnable {
    int value = 0;

    public  void run(){

      //  synchronized(this) {
            increment(value);
            System.out.println(Thread.currentThread().getName()+":"+getValue());

            decrement();
            System.out.println(Thread.currentThread().getName()+":"+getValue());
      //  }

    }

    private void increment(int value) {
        this.value = ++value;
    }

    private void decrement(){
        value--;
    }

    public int getValue(){
        return value;
    }

    public static void main(String args[]) {

        RaceCondition race = new RaceCondition();

        new Thread(race).start();
        new Thread(race).start();
        new Thread(race).start();

    }
}
