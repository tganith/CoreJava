package com.myproject.corejava.basics.shallowcloning;

public class ClonebleDemo {

    public static void main(String args[]) throws CloneNotSupportedException {

        // this is example for shallow copy
        EmployeeCloneble emp1 = new EmployeeCloneble(100,"ganitha",new Address(100,"Hyderabad"));
        EmployeeCloneble emp2 = (EmployeeCloneble)emp1.clone();

        emp1.getAddress().setCity("Bangalore");
        emp2.setEmpId(200);

        System.out.println(emp1);
        System.out.println(emp2);

    }

}
