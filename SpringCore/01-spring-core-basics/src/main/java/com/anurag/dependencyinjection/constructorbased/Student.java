package com.anurag.dependencyinjection.constructorbased;

public class Student {
    String name;
    String id;
    Address address;

    public Student(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address=" + address +
                '}';
    }
}
