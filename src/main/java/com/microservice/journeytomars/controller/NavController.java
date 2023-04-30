package com.microservice.journeytomars.controller;

import com.microservice.journeytomars.model.Travel;
import com.microservice.journeytomars.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nav")
public class NavController {

    @GetMapping("/createTravel")
    public ModelAndView createTravel() {
        ModelAndView model = new ModelAndView("travel/create");
        return model;
    }

    @GetMapping("/edit")
    public ModelAndView edit() {
        ModelAndView model = new ModelAndView("travel/edit");
        return model;
    }

    @GetMapping("/createSpacecraft")
    public ModelAndView createSpacecraft() {
        ModelAndView model = new ModelAndView("spacecraft/createSpacecraft");
        return model;
    }

    @GetMapping("/createCommander")
    public ModelAndView createCommander() {
        ModelAndView model = new ModelAndView("commander/createCommander");
        return model;
    }

}
