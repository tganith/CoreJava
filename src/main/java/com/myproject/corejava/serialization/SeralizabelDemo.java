package com.myproject.corejava.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SeralizabelDemo {

    public static void main(String args[]) throws Exception{



        Employee emp = new Employee(100,"ganitha");

        FileOutputStream fos = new FileOutputStream("emp.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp);

    }
}
