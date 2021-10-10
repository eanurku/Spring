package com.anurag.repository;

import com.anurag.models.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {

        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker=new Speaker("anurag","kumar");
        speakers.add(speaker);

        return speakers;
    }
}
