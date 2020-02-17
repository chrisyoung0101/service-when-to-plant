package com.weekybuild.whentoplant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController // DO NOT USE BOTH OF THESE ANNOTATIONS TOGETHER FOR PRODUCTION
public class PlantController {

    @Autowired
    private PlantService plantService;

    @Autowired
    private PlantRepository plantRepository;

    //For use with Thymeleaf front-end like in car_view_jpa
//    @GetMapping("/plant")
//    public String plantForm(Model model) {
//
//        model.addAttribute("plant", new Plant());
//        model.addAttribute( "plants", plantService.getAllPlants());
//
//        return "plant";
//    }

    //For testing use with curl command : curl 'localhost:8080/plant'
    @GetMapping(path="/plant")
    public @ResponseBody Iterable<Plant> getAllPlants() {
        return plantRepository.findAll();
    }


    @PostMapping("/plant")
    public String plantSubmit(@ModelAttribute Plant plant) {

        plantService.addPlant(plant);
        return "redirect:/plant";

    }


}
