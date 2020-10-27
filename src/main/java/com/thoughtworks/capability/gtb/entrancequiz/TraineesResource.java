package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TraineesResource {
    private final TraineesService service;

    public TraineesResource(TraineesService service) {
        this.service = service;
    }

    @GetMapping("/trainees")
    public List<Trainee> findAll() {
        return service.findAll();
    }
}
