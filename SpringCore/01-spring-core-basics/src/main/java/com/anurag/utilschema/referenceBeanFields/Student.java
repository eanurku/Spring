package com.anurag.utilschema.referenceBeanFields;

public class Student {
    int id;
    String sname;
    int age;

    public Student(int id, String sname, int age) {
        this.id = id;
        this.sname = sname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getSname() {
        return sname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
