package com.myproject.corejava.java8.defaultmethods;

import com.myproject.corejava.java8.annoymous.AnnoymousIfc;

public class DefaultMethodsDemo implements  InterfaceDefault{


   /*public  void m1(){
        System.out.println("override default m1 method executed");
    }*/
    public static void main(String args[]) {

        DefaultMethodsDemo defaultDemo = new DefaultMethodsDemo();

        defaultDemo.m1();

    }

}
