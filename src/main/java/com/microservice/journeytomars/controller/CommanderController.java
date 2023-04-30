package com.microservice.journeytomars.controller;

import com.microservice.journeytomars.model.Commander;
import com.microservice.journeytomars.model.Travel;
import com.microservice.journeytomars.service.CommanderService;
import com.microservice.journeytomars.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/commander")
public class CommanderController {

    @Autowired
    private CommanderService commanderService;

    @GetMapping("")
    public ModelAndView getAllCommanders() {
        ModelAndView model = new ModelAndView("commander/createCommander");
        List<Commander> listCommander = commanderService.findAll();
        System.out.println(listCommander);
        model.addObject("commanders", listCommander);
        return model;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("commander") Commander commander) {
        ModelAndView model = new ModelAndView("/index");
        commanderService.save(commander);
        return model;
    }

}
