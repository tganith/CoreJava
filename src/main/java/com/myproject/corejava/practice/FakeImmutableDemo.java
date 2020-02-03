package com.myproject.corejava.practice;

public class FakeImmutableDemo extends FakeImmutable {

    int value;

    public FakeImmutableDemo(int value){
        super(value);
        this.value=value;
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String args[]) {

        FakeImmutableDemo immutableDemo = new FakeImmutableDemo(10);
        FakeImmutable immutable = (FakeImmutable)immutableDemo;
        System.out.println(immutable.getValue());
        immutableDemo.setValue(20);
        System.out.println(immutable.getValue());
    }

}
