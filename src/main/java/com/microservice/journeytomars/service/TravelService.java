package com.microservice.journeytomars.service;

import com.microservice.journeytomars.model.Travel;

import java.util.List;

public interface TravelService {
    List<Travel> findAll();

    void save(Travel travel);

    Travel findById(Long id);

    void deleteById(Long id);

}
