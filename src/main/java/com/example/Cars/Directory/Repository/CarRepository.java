package com.example.Cars.Directory.Repository;

import com.example.Cars.Directory.Car.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Date;
import java.util.List;

public interface CarRepository extends JpaRepository<Car,Integer> {

    @Query(value = "SELECT addingDate FROM cars_directory ORDER BY addingDate LIMIT 1",nativeQuery = true)
    Date findFirstByOrderByAddingDateAsc();

    @Query(value = "SELECT addingDate FROM cars_directory ORDER BY addingDate DESC LIMIT 1", nativeQuery = true)
    Date findFirstByOrderByAddingDateDesc();

    List<Car> findByBrandOrderByAddingDateAsc(String brand);

    List<Car> findByOrderByProductionYearDesc();

}

