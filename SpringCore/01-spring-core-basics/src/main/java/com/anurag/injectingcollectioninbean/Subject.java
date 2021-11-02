package com.anurag.injectingcollectioninbean;

public class Subject {
    String subjectname;
    String marksObtained;

    public Subject(String subjectname, String marksObtained) {
        this.subjectname = subjectname;
        this.marksObtained = marksObtained;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public String getMarksObtained() {
        return marksObtained;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectname='" + subjectname + '\'' +
                ", marksObtained='" + marksObtained + '\'' +
                '}';
    }
}
