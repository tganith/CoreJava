package com.myproject.corejava.java8.functionalinterface;

public class FIMultiParamDemo {

    public static void main(String args[]) {

     FIMultiParam ifc = (a, b)-> System.out.println(a+b);
        ifc.add(10,20);
        ifc.add(100,200);

    }
}
