package com.microservice.journeytomars.service;

import com.microservice.journeytomars.model.Travel;
import com.microservice.journeytomars.repository.TravelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TravelServiceImpl implements TravelService {

    @Autowired
    private TravelRepository travelRepository;

    @Override
    public Optional<Travel> findById(Long id) {
        return travelRepository.findById(id);
    }

    @Override
    public List<Travel> findAll() {
        return travelRepository.findAll();
    }

    @Override
    public Travel save (Travel travel) {
        return travelRepository.save(travel);
    }

    @Override
    public Travel update(Travel travel) {
        return travelRepository.save(travel);
    }

    @Override
    public void deleteById(Long id) {
        travelRepository.deleteById(id);
    }
}
