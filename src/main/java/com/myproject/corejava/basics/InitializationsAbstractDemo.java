package com.myproject.corejava.basics;

public class InitializationsAbstractDemo extends InitializationsAbstract{


    InitializationsAbstractDemo() {
        System.out.println("constructor of InitializationsAbstractDemo");
    }

    static {
        System.out.println("static block of InitializationsAbstractDemo");
    }



    public static void main(String[] args) {
        System.out.println("main method executed");
        new InitializationsAbstractDemo();
    }


    {
        System.out.println("1st instance init InitializationsAbstractDemo");
    }



    public   void m1() {
        System.out.println("m1 method executed");
    }

}