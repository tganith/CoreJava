package com.myproject.corejava.java8.annoymous;

public class AnnoymousInnerRunnableDemo {

    public static void main(String args[]) {

        Runnable runnable = new Runnable() {
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("executed");
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }

}
