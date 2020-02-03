package com.myproject.corejava.basics;

public class Intilizations {


    /*Intilizations() {
        System.out.println("No  argument constructor");
    }

    static {
        System.out.println("1st static init");
    }

    static {
        System.out.println("2nd static init");
    }*/

    public static void main(String[] args) {
    //    System.out.println("main method");
        Intilizations obj =   new Intilizations();
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj.getClass());
       // new Intilizations();
    }


   /* {
        System.out.println("1st instance init");
    }

    {
        System.out.println("2nd instance init");
    }*/
}