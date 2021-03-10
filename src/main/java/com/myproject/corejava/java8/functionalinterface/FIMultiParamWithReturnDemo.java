package com.myproject.corejava.java8.functionalinterface;

public class FIMultiParamWithReturnDemo {

    public static void main(String args[]) {

      FIMultiParamWithReturn fi = (int a,int b) -> {return a+b;};
      int sum = fi.add(10,20);
      System.out.println(sum);

    }
}
