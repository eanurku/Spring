package com.anurag.factorybeans;

public class Department {

    String deptName;

    public Department() {
    }

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
