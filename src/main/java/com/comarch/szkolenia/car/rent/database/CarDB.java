package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Car;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class CarDB implements ICarDB {
    private final List<Car> cars = new ArrayList<>();
    //private final static CarDB instance = new CarDB();

    public CarDB() {
        this.cars.add(new Car("BMW", "3",
                399.00, "KR11"));
        this.cars.add(new Car("Audi", "A5",
                599.00, "KR22"));
        this.cars.add(new Car("Toyota", "Corolla",
                299.00, "KR33"));
        this.cars.add(new Car("Kia", "Ceed",
                199.00, "KR44"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public boolean rentCar(String plate) {
        return this.cars.stream()
                .filter(car -> car.getPlate().equals(plate))
                .filter(car -> !car.isRent())
                .peek(car -> car.setRent(true))
                .count() > 0;
    }

    /*public static CarDB getInstance() {
        return instance;
    }*/
}
