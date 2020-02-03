package com.myproject.corejava.multithreading.basics;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallablePrg  implements Callable<Integer> {

    public Integer call()  throws Exception{
        System.out.println("callable method executed");
        Thread.sleep(10000);
        return new Random().nextInt();
    }
}
