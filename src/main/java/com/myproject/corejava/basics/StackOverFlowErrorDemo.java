package com.myproject.corejava.basics;

public class StackOverFlowErrorDemo {

    public static void main(String args[]) {
        int n = 1;
         recursive(n);
    }

    private static int recursive(int n) {

        if(n ==  0){
            return 0;
        }
        return recursive(++n);
    }
}
