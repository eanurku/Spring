package com.anurag.utilschema.utilconstant.enumconstant;

public class Student {
    String sname;
    int id;
    StudentType studentType;

    public Student(String sname, int id, StudentType studentType) {
        this.sname = sname;
        this.id = id;
        this.studentType = studentType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", id=" + id +
                ", studentType=" + studentType +
                '}';
    }
}
