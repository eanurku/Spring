package com.anurag.beanloading.lazyloading;

public class Student {
    String sname;
    int id;

    public Student(String sname, int id) {
        this.sname = sname;
        this.id = id;
        System.out.println(" lazyloading.Student object instantiated..."+this.toString());
    }

    public String getSname() {
        return sname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", id=" + id +
                '}';
    }
}
