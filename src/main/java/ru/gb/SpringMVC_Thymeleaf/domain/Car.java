package ru.gb.SpringMVC_Thymeleaf.domain;

import lombok.Data;

@Data
public class Car {

    private Long id;
    private String car_make;
    private String model;

    public Car(Long id, String car_make, String model) {
        this.id = id;
        this.car_make = car_make;
        this.model = model;
    }


}