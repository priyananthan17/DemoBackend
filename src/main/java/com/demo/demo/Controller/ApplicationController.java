package com.demo.demo.Controller;

import com.demo.demo.Model.Application;
import com.demo.demo.Service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @PostMapping("/create")
    public Application create(@RequestBody Application app) {
        return service.create(app);
    }

    @GetMapping("/all")
    public List<Application> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Application> getById(@PathVariable String id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Application update(@PathVariable String id, @RequestBody Application app) {
        return service.update(id, app);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
