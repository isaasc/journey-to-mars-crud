package com.microservice.journeytomars.service.serviceImpl;

import com.microservice.journeytomars.model.Commander;
import com.microservice.journeytomars.model.Spacecraft;
import com.microservice.journeytomars.repository.CommanderRepository;
import com.microservice.journeytomars.repository.SpacecraftRepository;
import com.microservice.journeytomars.service.CommanderService;
import com.microservice.journeytomars.service.SpacecraftService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpacecraftServiceImpl implements SpacecraftService {

    @Autowired
    private SpacecraftRepository spacecraftRepository;

    @Override
    public List<Spacecraft> findAll() {
        return spacecraftRepository.findAll();
    }

    @Override
    public Spacecraft save (Spacecraft spacecraft) {
        return spacecraftRepository.save(spacecraft);
    }

}
