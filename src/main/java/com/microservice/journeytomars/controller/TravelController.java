package com.microservice.journeytomars.controller;

import com.microservice.journeytomars.model.Travel;
import com.microservice.journeytomars.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

@Controller
public class TravelController {

    @Autowired
    private TravelService travelService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Travel> listTravel = travelService.findAll();
        model.addAttribute("listTravels", listTravel);
        return "index";
    }

    @GetMapping("/showCreateTravelForm")
    public String showCreateTravelForm(Model model) {
        Travel travel = new Travel();
        model.addAttribute("travel", travel);
        return "/travel/create";
    }

    @PostMapping("/createTravel")
    public String createTravel(@ModelAttribute("travel") Travel travel) {
        var dateReturnEarth = calculateDateReturnEarth(travel);
        travel.setDateReturnEarth(dateReturnEarth);
        travelService.save(travel);
        return "redirect:/";
    }

    private Date calculateDateReturnEarth(Travel travel) {
        Calendar calendar = Calendar.getInstance();
        if (travel != null) {
            var sumOfDays = travel.getDaysOnMars() + travel.getTravelDaysToMars() + travel.getTravelDaysToEarth();
            calendar.setTime(travel.getTakeoffDate());
            calendar.add(Calendar.DAY_OF_MONTH, sumOfDays);
            Instant instant = Instant.parse(calendar.getTime().toInstant().toString());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = formatter.withZone(ZoneId.systemDefault()).format(instant);
            Date date = Date.valueOf(formattedDate);
            return date;
        }
        return null;
    }

    @GetMapping("/showUpdateTravelForm/{id}")
    public String showUpdateTravelForm(@PathVariable(value = "id") Long id, Model model) {
        Travel travel = travelService.findById(id);
        model.addAttribute("travel", travel);
        return "/travel/edit";
    }

    @GetMapping("/deleteTravel/{id}")
    public String delete(@PathVariable(value = "id") Long id) {
        travelService.deleteById(id);
        return "redirect:/";
    }
}
