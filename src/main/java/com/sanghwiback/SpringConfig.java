package com.sanghwiback;

import com.sanghwiback.domain.Activity;
import com.sanghwiback.domain.Goal;
import com.sanghwiback.domain.Routine;
import com.sanghwiback.repository.GoalRoutineActivityRepository;
import com.sanghwiback.repository.JpaActivityRepository;
import com.sanghwiback.repository.JpaGoalRepository;
import com.sanghwiback.repository.JpaRoutineRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public JpaGoalRepository goalRepository() {
        return new JpaGoalRepository(em);
    }

    @Bean
    public JpaRoutineRepository routineRepository() {
        return new JpaRoutineRepository(em);
    }

    @Bean
    public JpaActivityRepository activityRepository() {
        return new JpaActivityRepository(em);
    }
}
