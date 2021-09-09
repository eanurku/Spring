package com.anurag;

import com.anurag.services.SpeakerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(speakerService.findAll());

    }
}
