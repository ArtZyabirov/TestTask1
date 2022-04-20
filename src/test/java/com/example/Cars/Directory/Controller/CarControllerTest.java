package com.example.Cars.Directory.Controller;

import com.example.Cars.Directory.Car.Car;
import com.example.Cars.Directory.CarsService.CarsService;
import com.example.Cars.Directory.Repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class CarControllerTest {
    @MockBean
    private CarRepository carRepository;
    @MockBean
    private CarsService carsService;

    @Autowired
    private CarController carController;
    @Test
    public void add() {


    }

    @Test
    void firstRowDate() {


    }

    @Test
    void findByBrand() {
    }

    @Test
    void findByOrderProduction() {
    }
}