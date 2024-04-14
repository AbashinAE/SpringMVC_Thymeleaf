package ru.gb.SpringMVC_Thymeleaf.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.SpringMVC_Thymeleaf.domain.Car;
import ru.gb.SpringMVC_Thymeleaf.repository.CarRepository;


@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        carRepository.save(new Car(null, "Mercedes", "W140"));
        carRepository.save(new Car(null, "BMW", "X5"));
        carRepository.save(new Car(null, "Ford", "F-150"));
        return carRepository.findAll();
    }

    public Car getCarByID(Long id) {
        return carRepository.findById(id);
    }
}