package com.anurag;

import com.anurag.repository.HibernateSpeakerRepositoryImpl;
import com.anurag.repository.SpeakerRepository;
import com.anurag.services.SpeakerService;
import com.anurag.services.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.anurag")
public class AppConfig {
}
