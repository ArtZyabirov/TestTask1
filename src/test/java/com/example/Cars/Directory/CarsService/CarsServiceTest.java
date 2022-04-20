package com.example.Cars.Directory.CarsService;

import com.example.Cars.Directory.Repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class CarsServiceTest {
    @MockBean
    private CarRepository carRepository;
    @Autowired
    private CarsService carsService;

    @Test
    void count() {


    }

    @Test
    void firstRowDate() {

    }

    @Test
    void lastRowDate() {
    }
}