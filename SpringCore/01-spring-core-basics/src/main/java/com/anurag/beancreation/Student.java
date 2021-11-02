package com.anurag.beancreation;

public class Student {

    String sname;
    String regno;

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getSname() {
        return sname;
    }

    public String getRegno() {
        return regno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", regno='" + regno + '\'' +
                '}';
    }
}
