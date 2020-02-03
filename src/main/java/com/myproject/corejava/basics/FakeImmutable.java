package com.myproject.corejava.basics;

public class FakeImmutable {
    private final int value;

    public FakeImmutable(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
