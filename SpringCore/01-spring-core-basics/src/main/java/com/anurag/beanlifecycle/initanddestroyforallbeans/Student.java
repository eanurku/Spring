package com.anurag.beanlifecycle.initanddestroyforallbeans;

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

    public void initialize(){
        System.out.println("initializing method....");
    }
    public void clean(){
        System.out.println("clean method....");
    }
}
