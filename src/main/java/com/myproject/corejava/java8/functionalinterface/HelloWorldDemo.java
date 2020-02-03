package com.myproject.corejava.java8.functionalinterface;

public class HelloWorldDemo {

    public static void main(String args[]) {

        HelloWorldIfc ifc = ()->System.out.println("m1 method executed");
        ifc.m1();

    }
}
