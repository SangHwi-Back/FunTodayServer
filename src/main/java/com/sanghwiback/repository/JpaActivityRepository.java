package com.sanghwiback.repository;

import com.sanghwiback.domain.Activity;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class JpaActivityRepository implements GoalRoutineActivityRepository<Activity> {
    private final EntityManager em;

    public JpaActivityRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Activity save(Activity obj) {
        return null;
    }

    @Override
    public Optional<Activity> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<Activity> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Activity> findAll() {
        return null;
    }
}
