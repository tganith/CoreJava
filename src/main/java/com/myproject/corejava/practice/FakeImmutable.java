package com.myproject.corejava.practice;

public  class FakeImmutable {

    private final int value;

    public FakeImmutable(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }


}
