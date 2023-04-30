package com.microservice.journeytomars.service.serviceImpl;

import com.microservice.journeytomars.model.Commander;
import com.microservice.journeytomars.model.Travel;
import com.microservice.journeytomars.repository.CommanderRepository;
import com.microservice.journeytomars.repository.TravelRepository;
import com.microservice.journeytomars.service.CommanderService;
import com.microservice.journeytomars.service.TravelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommanderServiceImpl implements CommanderService {

    @Autowired
    private CommanderRepository commanderRepository;

    @Override
    public List<Commander> findAll() {
        return commanderRepository.findAll();
    }

    @Override
    public Commander save (Commander commander) {
        return commanderRepository.save(commander);
    }

}
