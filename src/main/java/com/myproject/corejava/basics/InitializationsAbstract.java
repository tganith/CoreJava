package com.myproject.corejava.basics;

public abstract class InitializationsAbstract {


    InitializationsAbstract() {
        System.out.println("constructor of InitializationsAbstract");
    }

    static {
        System.out.println("static block of InitializationsAbstract");
    }


    {
        System.out.println("Initial block of InitializationsAbstract");
    }


    public  abstract void m1();


}