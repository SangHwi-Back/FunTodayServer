package com.sanghwiback.service;

import com.sanghwiback.domain.Goal;
import com.sanghwiback.repository.JpaGoalRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class GoalService {
    private final JpaGoalRepository goalRepository;

    public GoalService(JpaGoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public List<Goal> list() {
        return goalRepository.findAll();
    }
}
