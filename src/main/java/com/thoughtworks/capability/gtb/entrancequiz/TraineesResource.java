package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TraineesResource {
    private final TraineesService service;

    public TraineesResource(TraineesService service) {
        this.service = service;
    }

    @GetMapping("/trainees")
    public List<Trainee> findAll() {
        return service.findAll();
    }

    @PostMapping("/trainees")
    public List<Trainee> addOneByName(@RequestBody String name) {
        return service.addOneByName(name);
    }
}
