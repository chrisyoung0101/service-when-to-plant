package com.weekybuild.whentoplant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PlantRepository extends JpaRepository<Plant, Integer> {

    @Query(value="SELECT * FROM planting_time;", nativeQuery=true)
    List<Plant> getAllPlants();

}

