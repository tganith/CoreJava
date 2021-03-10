package com.myproject.corejava.practice;

import com.fasterxml.uuid.Generators;

import java.util.UUID;

public class test {

    public static void main(String[] args) {

        if(false || true){
            System.out.println("executed");
        }


        UUID uuid = Generators.timeBasedGenerator().generate();
        System.out.println(uuid);
        System.out.println(uuid.toString());


    }

}
