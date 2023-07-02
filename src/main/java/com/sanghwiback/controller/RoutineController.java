package com.sanghwiback.controller;

import com.sanghwiback.domain.Routine;
import com.sanghwiback.service.RoutineService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RoutineController {
    private RoutineService service;

    public RoutineController(RoutineService service) {
        this.service = service;
    }

    @GetMapping("routine/list")
    public List<Routine> list() {
        return service.list();
    }
}
