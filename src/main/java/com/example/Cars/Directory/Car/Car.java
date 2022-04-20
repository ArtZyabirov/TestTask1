package com.example.Cars.Directory.Car;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name= "cars_directory")
public class Car {
    @Id
    private int id;
    @Temporal(TemporalType.DATE)
    private Date addingDate;
    private String regNumber;
    private String brand;
    private String color;
    private int productionYear;



    public Car(int id, Date addingDate, String regNumber, String brand, String color, int productionYear) {
        this.id = id;
        this.addingDate = addingDate;
        this.regNumber = regNumber;
        this.brand = brand;
        this.color = color;
        this.productionYear = productionYear;
    }

    public Car() {

    }

    public Date getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(Date addingDate) {
        this.addingDate = addingDate;
    }

    public int getId() {
        return id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
