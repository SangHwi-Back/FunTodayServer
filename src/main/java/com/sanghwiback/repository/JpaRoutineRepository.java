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
        em.persist(obj);
        return null;
    }

    @Override
    public Optional<Routine> findById(String id) {
        Routine routine = em.find(Routine.class, id);
        return Optional.ofNullable(routine);
    }

    @Override
    public Optional<Routine> findByName(String name) {
        List<Routine> result = em.createQuery("select r from Routine r where r.name = :name", Routine.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Routine> findAll() {
        return em.createQuery("select r from Routine r", Routine.class)
                .getResultList();
    }
}
