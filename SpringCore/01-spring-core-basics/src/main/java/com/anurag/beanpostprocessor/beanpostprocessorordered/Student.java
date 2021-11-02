package com.anurag.beanpostprocessor.beanpostprocessorordered;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

    int id;
    String sname;

    public Student(int id, String sname) {
        this.id = id;
        this.sname = sname;

    }

    public int getId() {
        return id;
    }

    public String getSname() {
        return sname;
    }

    @PostConstruct
    public void initialize(){
        System.out.println("initializing method....");
    }
    @PreDestroy
    public void clean(){
        System.out.println("clean method....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                '}';
    }
}
