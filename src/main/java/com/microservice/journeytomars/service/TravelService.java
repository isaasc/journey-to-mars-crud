package com.microservice.journeytomars.service;

import com.microservice.journeytomars.model.Travel;

import java.util.List;
import java.util.Optional;

public interface TravelService {
    Optional<Travel> findById(Long id);
    List<Travel> findAll();
    Travel save (Travel travel);
    Travel update(Travel travel);
    void deleteById(Long id);
}
