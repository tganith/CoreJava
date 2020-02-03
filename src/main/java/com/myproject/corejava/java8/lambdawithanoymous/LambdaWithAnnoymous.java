package com.myproject.corejava.java8.lambdawithanoymous;

import java.util.Set;
import java.util.TreeSet;

public class LambdaWithAnnoymous {

    public static void main(String args[]) {

        // sc1
        Runnable runnable = ()->{
          for(int i=0;i<10;i++){
              System.out.println("executed");
          }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        // sc2
        Thread thread1 = new Thread( ()->{
            for(int i=0;i<10;i++){
                System.out.println("executed");
            }
        });
        thread1.start();
    }
}
