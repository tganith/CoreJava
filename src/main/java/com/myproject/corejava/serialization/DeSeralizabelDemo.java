package com.myproject.corejava.serialization;

import java.io.*;

public class DeSeralizabelDemo {

    public static void main(String args[]) throws Exception{

        FileInputStream fis = new FileInputStream("emp.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee emp = (Employee)ois.readObject();

        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
    }
}
