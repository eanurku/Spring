package com.anurag;

import com.anurag.repository.HibernateSpeakerRepositoryImpl;
import com.anurag.repository.SpeakerRepository;
import com.anurag.services.SpeakerService;
import com.anurag.services.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("speakerService")
    public SpeakerService getSpeakerService() {

        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());//constructor based
        // service.setSpeakerRepository(getSpeakerRepository());//setter based
        return service;
    }

    @Bean("speakerRepository")
    public SpeakerRepository getSpeakerRepository() {

        HibernateSpeakerRepositoryImpl repository = new HibernateSpeakerRepositoryImpl();

        return repository;
    }

}
