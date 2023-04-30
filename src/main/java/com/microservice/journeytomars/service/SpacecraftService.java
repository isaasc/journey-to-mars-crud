package com.microservice.journeytomars.service;

import com.microservice.journeytomars.model.Commander;
import com.microservice.journeytomars.model.Spacecraft;

import java.util.List;

public interface SpacecraftService {
    List<Spacecraft> findAll();
    Spacecraft save (Spacecraft spacecraft);

}
