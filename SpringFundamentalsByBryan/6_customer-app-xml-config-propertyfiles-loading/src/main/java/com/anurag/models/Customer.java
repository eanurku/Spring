package com.anurag.models;

public class Customer {

    String firstname;
    String secondname;

    public Customer() {
    }

    public Customer(String firstname, String secondname) {
        this.firstname = firstname;
        this.secondname = secondname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                '}';
    }
}
