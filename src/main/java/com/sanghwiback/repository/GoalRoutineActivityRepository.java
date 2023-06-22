package com.sanghwiback.repository;

import java.util.List;
import java.util.Optional;

public interface GoalRoutineActivityRepository<ITEM> {
    ITEM save(ITEM obj);
    Optional<ITEM> findById(String id);
    Optional<ITEM> findByName(String name);
    List<ITEM> findAll();
}
