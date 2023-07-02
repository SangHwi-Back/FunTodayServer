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
        em.persist(obj);
        return null;
    }

    @Override
    public Optional<Goal> findById(String id) {
        em.find(Goal.class, id);
        return Optional.empty();
    }

    @Override
    public Optional<Goal> findByName(String name) {
        List<Goal> result = em.createQuery("select g from Goal g where g.name = :name", Goal.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Goal> findAll() {
        return em.createQuery("select g from Goal g", Goal.class)
                .getResultList();
    }
}
