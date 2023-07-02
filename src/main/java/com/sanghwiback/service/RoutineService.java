package com.sanghwiback.service;

import com.sanghwiback.domain.Routine;
import com.sanghwiback.repository.JpaRoutineRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RoutineService {
    private final JpaRoutineRepository routineRepository;

    public RoutineService(JpaRoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }

    public List<Routine> list() {
        return routineRepository.findAll();
    }
}
