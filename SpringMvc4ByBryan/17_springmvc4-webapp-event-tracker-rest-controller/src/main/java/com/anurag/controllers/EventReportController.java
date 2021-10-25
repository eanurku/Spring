package com.anurag.controllers;

import com.anurag.models.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventReportController {

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public List<Event> getEvents() {
        List<Event> events = new ArrayList<Event>();
        Event event1 = new Event();
        event1.setEventName("Java User Group");
        Event event2 = new Event();
        event2.setEventName("Angular User Group");

        Event event3 = new Event();
        event3.setEventName("React User Group");

        events.add(event1);
        events.add(event2);
        events.add(event3);
        return events;
    }
}
