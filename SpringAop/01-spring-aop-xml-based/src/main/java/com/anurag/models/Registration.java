package com.anurag.models;

import javax.validation.constraints.Size;

public class Registration {
    @Size(min = 4,max = 20)
    private String name;
    private String email;

    public Registration() {
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
        return "Registration{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
