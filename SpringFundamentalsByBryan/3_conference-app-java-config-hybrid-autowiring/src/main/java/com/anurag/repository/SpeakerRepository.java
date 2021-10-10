package com.anurag.repository;

import com.anurag.models.Speaker;

import java.util.List;

public interface SpeakerRepository {

    List<Speaker> findAll();
}
