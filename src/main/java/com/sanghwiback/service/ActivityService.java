package com.sanghwiback.service;

import com.sanghwiback.domain.Activity;
import com.sanghwiback.repository.JpaActivityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ActivityService {

    private final JpaActivityRepository activityRepository;

    public ActivityService(JpaActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public List<Activity> list() {
        return activityRepository.findAll();
    }
}
