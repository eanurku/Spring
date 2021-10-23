package com.anurag.models;

public class Attendee {

    private String name;
    private String email;

    public Attendee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
