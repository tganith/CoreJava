package com.myproject.corejava.basics.shallowcloning;

public class Address {
    private String city;
    private int doorNo;

    public Address(int doorNo,String city){
        this.doorNo = doorNo;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String toString(){
        return "DoorNo:"+doorNo+" "+city;
    }


}
