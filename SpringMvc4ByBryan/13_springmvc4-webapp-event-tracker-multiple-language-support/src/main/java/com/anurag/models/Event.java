package com.anurag.models;

public class Event {

    private String eventName;

    public Event() {
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                '}';
    }
}
