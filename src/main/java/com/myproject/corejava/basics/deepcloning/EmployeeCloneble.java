package com.myproject.corejava.basics.deepcloning;

public class EmployeeCloneble implements Cloneable{

    private int empId;
    private String empName;
    private Address address;

    public EmployeeCloneble(int empId,String empName){
        this.empId= empId;
        this.empName = empName;
    }

    public EmployeeCloneble(int empId, String empName, Address address){
        this.empId= empId;
        this.empName = empName;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        EmployeeCloneble employeeCloneble = (EmployeeCloneble)  super.clone();
        employeeCloneble.setAddress((Address)employeeCloneble.getAddress().clone());
        return employeeCloneble;
    }

    public String toString(){
        return "EmpId:"+empId+" EmpName:"+empName+"; DoorNo:"+address.getDoorNo()+" City:"+ address.getCity();
    }

}
