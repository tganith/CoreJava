package com.myproject.corejava.java8.functionalinterface;

public class FIMultiParamStringWithReturnDemo {

    public static void main(String args[]) {

        FIMultiParamStringWithReturn ifc = s->s.length();
        int length = ifc.getLength("ganitha");
        System.out.println(length);

    }
}
