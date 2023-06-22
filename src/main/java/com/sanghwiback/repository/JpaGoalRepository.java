package com.sanghwiback.repository;

import jakarta.persistence.EntityManager;
import com.sanghwiback.domain.Goal;
import java.util.List;
import java.util.Optional;

public class JpaGoalRepository implements GoalRoutineActivityRepository<Goal> {

    private final EntityManager em;

    public JpaGoalRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Goal save(Goal obj) {
        return null;
    }

    @Override
    public Optional<Goal> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<Goal> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Goal> findAll() {
        return null;
    }
}
