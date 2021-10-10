package com.anurag.services;

import com.anurag.models.Speaker;
import com.anurag.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "speakerService")
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
