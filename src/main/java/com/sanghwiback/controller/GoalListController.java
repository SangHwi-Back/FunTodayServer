package com.sanghwiback.controller;

import com.sanghwiback.domain.Goal;
import com.sanghwiback.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GoalListController {

    private final GoalService service;

    @Autowired
    public GoalListController(GoalService goalService) {
        this.service = goalService;
    }

    @GetMapping("goal/list")
    public List<Goal> list() {
        return service.list();
    }
}
