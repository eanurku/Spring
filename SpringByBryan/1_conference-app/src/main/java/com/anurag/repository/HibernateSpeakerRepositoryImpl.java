package com.anurag.repository;

import com.anurag.models.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {

        List<Speaker> speakers = new ArrayList<Speaker>();
        //add speaker to this list

        return speakers;
    }
}
