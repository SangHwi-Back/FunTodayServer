package com.sanghwiback.repository;

import com.sanghwiback.domain.Routine;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class JpaRoutineRepository implements GoalRoutineActivityRepository<Routine>{
    private final EntityManager em;

    public JpaRoutineRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Routine save(Routine obj) {
        return null;
    }

    @Override
    public Optional<Routine> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<Routine> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Routine> findAll() {
        return null;
    }
}
