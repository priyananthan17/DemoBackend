package com.demo.demo.Service;

import com.demo.demo.Model.Application;
import com.demo.demo.Repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository repository;

    public Application create(Application app) {
        return repository.save(app);
    }

    public List<Application> getAll() {
        return repository.findAll();
    }

    public Optional<Application> getById(String id) {
        return repository.findById(id);
    }

    public Application update(String id, Application updatedApp) {
        updatedApp.setId(id);
        return repository.save(updatedApp);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
