package com.anurag.repository;

import com.anurag.models.Activity;

import java.util.List;

public interface ActivityRepository {
    List<Activity> findAllActivities();
}
