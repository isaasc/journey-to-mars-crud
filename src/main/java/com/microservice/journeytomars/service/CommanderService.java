package com.microservice.journeytomars.service;

import com.microservice.journeytomars.model.Commander;

import java.util.List;

public interface CommanderService {
    List<Commander> findAll();
    Commander save (Commander commander);

}
