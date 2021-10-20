package com.anurag.repository;

import com.anurag.models.Activity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "activityRepository")
public class ActivityRepositoryImpl implements ActivityRepository {


    @Override
    public List<Activity> findAllActivities() {

        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity(123, "cycling"));
        activities.add(new Activity(123, "biking"));
        activities.add(new Activity(123, "running"));
        return activities;
    }
}
