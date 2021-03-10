package com.myproject.corejava.java8.staticmethods;

public class StaticMethod implements StaticIfc{


    public static void m1(){
        System.out.println("m1 override method executed");
    }

    public static void main(String args[]){
        StaticIfc.m1();

        StaticMethod staticMethod = new StaticMethod();
        staticMethod.m1();
    }
}
