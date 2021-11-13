package com.anurag.models;

public class RegistrationReport {

    private String name;
    private String courseName;
    private String courseDescription;

    public RegistrationReport(String name, String courseName, String courseDescription) {
        this.name = name;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    public RegistrationReport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    @Override
    public String toString() {
        return "RegistrationReport{" +
                "name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                '}';
    }
}
