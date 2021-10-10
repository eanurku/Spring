package com.anurag.services;

import com.anurag.models.Speaker;
import com.anurag.repository.HibernateSpeakerRepositoryImpl;
import com.anurag.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {

        return speakerRepository.findAll();
    }
}
