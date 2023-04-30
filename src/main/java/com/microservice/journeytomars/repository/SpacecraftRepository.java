package com.microservice.journeytomars.repository;

import com.microservice.journeytomars.model.Commander;
import com.microservice.journeytomars.model.Spacecraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpacecraftRepository extends JpaRepository<Spacecraft, Long> {
}
