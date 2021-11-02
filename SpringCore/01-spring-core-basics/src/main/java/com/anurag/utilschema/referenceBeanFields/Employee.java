package com.anurag.utilschema.referenceBeanFields;

public class Employee {
    int eid;
    int age;

    public Employee(int eid, int age) {
        this.eid = eid;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", age=" + age +
                '}';
    }
}
