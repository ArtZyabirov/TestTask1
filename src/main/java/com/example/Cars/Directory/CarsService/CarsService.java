package com.example.Cars.Directory.CarsService;

import com.example.Cars.Directory.Car.Car;
import com.example.Cars.Directory.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;



@Service
@Transactional
public class CarsService {
    @Autowired
    private CarRepository carRepository;

;   public List<Car> listAllCars() {
        return carRepository.findAll();
    }
    public void saveCar(Car car) {
        carRepository.save(car);
    }
    public void deleteCar(Integer id) {
        carRepository.deleteById(id);
    }
    //метод считает общее количество записей
    public String count() {
        return ("Общее количество записей: " + carRepository.count());
    }
    //метод показывает дату добавления первой записи в таблицу
    public String firstRowDate() {
        return ("Дата добавления первой записи: " + carRepository.findFirstByOrderByAddingDateAsc());
    }
    ////метод показывает дату добавления последней записи в таблицу
    public String lastRowDate() {
        return ("Дата добавления последней записи: " + carRepository.findFirstByOrderByAddingDateDesc());

    }
    //метод показывает записи по аттрибуту марки машины Мерседес по дате добавления в убывающем порядке
    public List<Car> findMercedeses() {
        return carRepository.findByBrandOrderByAddingDateAsc("mercedes");
    }
    //метод показывает записи убывающие по году производству
    public List<Car> orderByProductionYear() {
        return carRepository.findByOrderByProductionYearDesc();
    }


}
