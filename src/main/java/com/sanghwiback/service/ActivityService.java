package com.sanghwiback.service;

import com.sanghwiback.repository.JpaActivityRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ActivityService {

    private final JpaActivityRepository activityRepository;

    public ActivityService(JpaActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }
}
