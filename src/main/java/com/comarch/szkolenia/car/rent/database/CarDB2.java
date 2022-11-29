package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Car;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDB2 implements ICarDB {
    private final List<Car> cars = new ArrayList<>();
    //private final static CarDB2 instance = new CarDB2();

    public CarDB2() {
        this.cars.add(new Car("BMW", "3",
                399.00, "KR111"));
        this.cars.add(new Car("Audi", "A5",
                599.00, "KR222"));
        this.cars.add(new Car("Toyota", "Corolla",
                299.00, "KR333"));
        this.cars.add(new Car("Kia", "Ceed",
                199.00, "KR444"));
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

    /*public static CarDB2 getInstance() {
        return instance;
    }*/
}
