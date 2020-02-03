package com.myproject.corejava.serialization;

import sun.plugin2.message.Serializer;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 2L;

    private String name;
    private int empId;

    public Employee(int empId,String name) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
