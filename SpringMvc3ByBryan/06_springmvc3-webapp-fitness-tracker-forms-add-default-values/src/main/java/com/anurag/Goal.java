package com.anurag;

public class Goal {
    int minutes;

    public Goal() {
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "minutes=" + minutes +
                '}';
    }
}
