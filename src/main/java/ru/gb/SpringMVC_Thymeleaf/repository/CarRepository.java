package ru.gb.SpringMVC_Thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Component;
import ru.gb.SpringMVC_Thymeleaf.domain.Car;

@Component
public class CarRepository {

    private Map<Long, Car> cars = new ConcurrentHashMap<>();
    private AtomicLong counter = new AtomicLong();

    public List<Car> findAll() {
        return new ArrayList<>(cars.values());
    }

    public Car findById(Long id) {
        return cars.get(id);
    }

    public Car save(Car car) {
        if (car.getId() == null) {
            car.setId(counter.incrementAndGet());
        }
        cars.put(car.getId(), car);
        return car;
    }
}