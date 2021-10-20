package com.anurag.models;

import org.hibernate.validator.constraints.Range;

public class Goal {
    @Range(min = 1, max = 1000)
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
