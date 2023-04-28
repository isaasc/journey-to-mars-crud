package com.microservice.journeytomars.repository;

import com.microservice.journeytomars.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel, Long> {
}
