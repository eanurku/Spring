package com.anurag.models;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "contact")
    String contact;

    public Student(Long id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }


}