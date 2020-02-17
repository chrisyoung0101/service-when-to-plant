package com.weekybuild.whentoplant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlantService {

    @Autowired
    private PlantRepository plantRepository;

    public void addPlant(Plant plant) { plantRepository.save(plant); }

    public List<Plant> getAllPlants() {

        List<Plant> plants = new ArrayList<>();
        plantRepository.findAll().forEach(plants::add);

        return plants;

    }

}
