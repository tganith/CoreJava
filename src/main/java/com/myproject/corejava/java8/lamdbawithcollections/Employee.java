package com.myproject.corejava.java8.lamdbawithcollections;

public class Employee {

    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String toString(){
        return getEmpId()+":"+getEmpName();
    }
}
