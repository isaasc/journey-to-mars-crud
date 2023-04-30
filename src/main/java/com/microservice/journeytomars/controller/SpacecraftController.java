package com.microservice.journeytomars.controller;

import com.microservice.journeytomars.model.Spacecraft;
import com.microservice.journeytomars.service.SpacecraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/spacecraft")
public class SpacecraftController {

    @Autowired
    private SpacecraftService spacecraftService;

    @GetMapping("")
    public ModelAndView getAllSpacecrafts() {
        ModelAndView model = new ModelAndView("spacecraft/createSpacecraft");
        List<Spacecraft> listSpacecraft = spacecraftService.findAll();
        System.out.println(listSpacecraft);
        model.addObject("spacecrafts", listSpacecraft);
        return model;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("spacecraft") Spacecraft spacecraft) {
        ModelAndView model = new ModelAndView("/index");
        spacecraftService.save(spacecraft);
        return model;
    }

}
