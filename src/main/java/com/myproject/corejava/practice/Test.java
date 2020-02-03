package com.myproject.corejava.practice;

public class Test {


    public static void main(String args[]) {


        int[] arr = {1,2,3,4,5};
        int rotateCount = 2;

        int temp;

        for(int i =1;i<=rotateCount;i++){
            temp =  arr[arr.length-1];

            for(int j = arr.length-1 ; j>0;j--){
                   arr[j] = arr[j-1];
            }

            arr[0] = temp;

        }

        for(int x:arr){
            System.out.print(x+" ");
        }



    }
}
