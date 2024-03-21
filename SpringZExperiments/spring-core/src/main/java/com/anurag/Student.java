package com.anurag;

import java.util.List;

public class Student {
    int roll;
    String name;
    Department dep;
    List<Integer> marks;
    int type;



    public Student() {
    }

    void init(){
        System.out.println("init.....");
    }
    void clean(){
        System.out.println("clean....");
    }


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", dep=" + dep +
                ", marks=" + marks +
                ", type=" + type +
                '}';
    }
}
