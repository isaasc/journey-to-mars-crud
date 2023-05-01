package com.microservice.journeytomars.service;

import com.microservice.journeytomars.model.Travel;
import com.microservice.journeytomars.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface TravelService {
    List<Travel> findAll();

    void save(Travel travel);

    Travel findById(Long id);

    void deleteById(Long id);

    @Service
    class TravelServiceImpl implements TravelService {

        @Autowired
        private TravelRepository travelRepository;

        @Override
        public List<Travel> findAll() {
            return travelRepository.findAll();
        }

        @Override
        public void save(Travel travel) {
            this.travelRepository.save(travel);
        }

        @Override
        public Travel findById(Long id) {
            Optional<Travel> travelOptional = travelRepository.findById(id);
            Travel travel = null;
            if (travelOptional.isPresent()) {
                travel = travelOptional.get();
            } else {
                throw new RuntimeException("Travel not found for this id: " + id);
            }
            return travel;
        }

        @Override
        public void deleteById(Long id) {
            this.travelRepository.deleteById(id);
        }
    }
}
