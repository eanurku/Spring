package com.anurag.models;

public class Excercise {
    private int minutes;
    private String activity;

    public Excercise() {
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Excercise{" +
                "minutes=" + minutes +
                ", activity='" + activity + '\'' +
                '}';
    }
}
