package com.anurag.injectingcollectioninbean;

import java.util.List;

public class Student {
    String sname;
    List<Subject> subjects;

    public Student(){

    }
    public Student(String sname, List<Subject> subjects) {
        this.sname = sname;
        this.subjects = subjects;
    }

    public String getSname() {
        return sname;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
