package com.anurag.utilschema.utilconstant.staticconstant;

public class Student {

    String sname;
    int    id;
    int    studentType;
    String depprefix;

    public Student(String sname, int id, int studentType, String depprefix) {
        this.sname = sname;
        this.id = id;
        this.studentType = studentType;
        this.depprefix = depprefix;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", id=" + id +
                ", studentType=" + studentType +
                ", depprefix='" + depprefix + '\'' +
                '}';
    }
}
