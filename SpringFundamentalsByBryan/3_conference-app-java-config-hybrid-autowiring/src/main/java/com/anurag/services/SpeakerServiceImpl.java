package com.anurag.services;

import com.anurag.models.Speaker;
import com.anurag.repository.HibernateSpeakerRepositoryImpl;
import com.anurag.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    SpeakerRepository speakerRepository ;

    public SpeakerServiceImpl() {
    }


    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public List<Speaker> findAll() {

        return speakerRepository.findAll();
    }


    @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }


}
