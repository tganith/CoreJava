package com.myproject.corejava.basics;

public class DynamicDataTypes {

    public static void main(String[] args) {

        Object obj = 'a';
        checkType(obj);

    }

    public static <T extends Object> void checkType(T object) {
        if (object instanceof Integer)
            System.out.println("Integer");
        else if(object instanceof  String)
            System.out.println("String ");
        else if(object instanceof  Float)
            System.out.println("Float ");
        else if(object instanceof  Double)
            System.out.println("Double ");
        else if(object instanceof Character)
            System.out.println("Character");
        else if(object instanceof Boolean)
            System.out.println("Boolean");

    }
}
