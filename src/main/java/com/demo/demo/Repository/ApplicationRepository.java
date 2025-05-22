package com.demo.demo.Repository;

import com.demo.demo.Model.Application;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApplicationRepository extends MongoRepository<Application, String> {
}
