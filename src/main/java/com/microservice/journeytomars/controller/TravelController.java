package com.microservice.journeytomars.controller;

import com.microservice.journeytomars.model.Travel;
import com.microservice.journeytomars.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/travels")
public class TravelController {

    @Autowired
    private TravelService travelService;

    @GetMapping
    public ResponseEntity<List<Travel>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(travelService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Travel>> finById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(travelService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Travel> create(@RequestBody Travel travel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(travelService.save(travel));
    }

    @PutMapping
    public ResponseEntity<Travel> update(@RequestBody Travel travel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(travelService.update(travel));
    }
}
