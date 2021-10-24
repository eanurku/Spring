package com.anurag.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;


public class Attendee {

    @Size(min = 2,max = 30)
    private String name;

    @NotEmpty
    @Email
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
