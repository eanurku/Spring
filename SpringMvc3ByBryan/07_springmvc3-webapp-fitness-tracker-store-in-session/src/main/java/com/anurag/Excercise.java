package com.anurag;

public class Excercise {
    private int minutes;

    public Excercise() {
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Excercise{" +
                "minutes=" + minutes +
                '}';
    }
}
