package com.sanghwiback.controller;

import com.sanghwiback.domain.Activity;
import com.sanghwiback.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ActivityController {
    private ActivityService service;

    @Autowired
    public ActivityController(ActivityService activityService) {
        this.service = activityService;
    }

    @GetMapping("activity/list")
    public List<Activity> list() {
        return service.list();
    }
}
