package com.sanghwiback.service;

import com.sanghwiback.repository.JpaRoutineRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RoutineService {
    private final JpaRoutineRepository routineRepository;

    public RoutineService(JpaRoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }
}
