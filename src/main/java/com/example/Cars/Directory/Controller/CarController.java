package com.example.Cars.Directory.Controller;


import com.example.Cars.Directory.Car.Car;
import com.example.Cars.Directory.CarsService.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarsService carsService;

    @GetMapping("")
    public List<Car> list() {
        return carsService.listAllCars();
    }
    @PostMapping("/")
    public void add(@RequestBody Car car) {
        carsService.saveCar(car);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        carsService.deleteCar(id);
    }
    @GetMapping("/count")
    public String count() {
        return carsService.count();
    }
    @GetMapping("/firstDate")
    public String firstRowDate() {
        return carsService.firstRowDate();
    }
    @GetMapping("/lastDate")
    public String lastRowDate() {
        return carsService.lastRowDate();
    }
    @GetMapping("/mercedes")
    public List<Car> findByBrand() {
        return carsService.findMercedeses();
    }
    @GetMapping("/production")
    public List<Car> findByOrderProduction() {
        return carsService.orderByProductionYear();
    }

}
