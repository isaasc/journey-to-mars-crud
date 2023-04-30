package com.microservice.journeytomars.repository;

import com.microservice.journeytomars.model.Commander;
import com.microservice.journeytomars.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommanderRepository extends JpaRepository<Commander, Long> {
}
