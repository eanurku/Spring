package com.anurag.services;

import com.anurag.models.Activity;
import com.anurag.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "activityService")
public class ActivityServiceImpl implements ActivityService {


    @Autowired
    private ActivityRepository repository;

    @Override
    public List<Activity> findAllActivities() {
        return repository.findAllActivities();
    }

}
