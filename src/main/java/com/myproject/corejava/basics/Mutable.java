package com.myproject.corejava.basics;

import java.util.Hashtable;
import java.util.Map;

public class Mutable extends FakeImmutable{
    private  int value;

    public Mutable(int value){
        super(value);
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String args[]){
        Mutable m = new Mutable(10);
        FakeImmutable fi =(FakeImmutable)m;


        System.out.println(fi.getValue());
        m.setValue(50);
        System.out.println(fi.getValue());


    }

}
