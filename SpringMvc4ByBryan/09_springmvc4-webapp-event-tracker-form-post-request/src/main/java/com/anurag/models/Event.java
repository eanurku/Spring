package com.anurag.models;

public class Event {

    private String eventName;

    public Event() {
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + eventName + '\'' +
                '}';
    }
}
