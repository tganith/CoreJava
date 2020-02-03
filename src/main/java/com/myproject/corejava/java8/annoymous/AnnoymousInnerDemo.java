package com.myproject.corejava.java8.annoymous;

public class AnnoymousInnerDemo {
    private int x = 100;

    public void m2(){
        AnnoymousIfc annoymousIfc = new AnnoymousIfc() {
            int x = 200;
            @Override
            public void m1() {
                System.out.println(this.x);
                System.out.println(AnnoymousInnerDemo.this.x);
            }
        };
        annoymousIfc.m1();
    }

    public static void main(String args[]) {

        AnnoymousInnerDemo demo = new AnnoymousInnerDemo();
        demo.m2();

    }

}
