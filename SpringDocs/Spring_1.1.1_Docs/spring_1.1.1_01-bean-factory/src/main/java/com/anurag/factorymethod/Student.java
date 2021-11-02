package com.anurag.factorymethod;

public class Student {

    int id;
    String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static  Department getDepartment(){
        return new Department("dept name 1");
    }

    public static  Department getDepartmentWithName(String deptName){
        return new Department(deptName);
    }

    public   Department getDepartmentInstanceMethod(String deptName){
        return new Department(deptName);
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
