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
        em.persist(obj);
        return obj;
    }

    @Override
    public Optional<Activity> findById(String id) {
        Activity activity = em.find(Activity.class, id);
        return Optional.ofNullable(activity);
    }

    @Override
    public Optional<Activity> findByName(String name) {
        List<Activity> result = em.createQuery("select a from Activity a where a.name = :name", Activity.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Activity> findAll() {
        return em.createQuery("select a from Activity a", Activity.class)
                .getResultList();
    }
}
