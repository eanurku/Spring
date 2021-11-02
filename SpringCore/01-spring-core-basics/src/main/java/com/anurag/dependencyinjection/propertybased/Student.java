package com.anurag.dependencyinjection.propertybased;

public class Student {
    String sname;
    Address address;

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSname() {
        return sname;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", address=" + address +
                '}';
    }
}
