package com.sanghwiback.service;

import com.sanghwiback.repository.JpaGoalRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GoalService {
    private final JpaGoalRepository goalRepository;

    public GoalService(JpaGoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }
}
