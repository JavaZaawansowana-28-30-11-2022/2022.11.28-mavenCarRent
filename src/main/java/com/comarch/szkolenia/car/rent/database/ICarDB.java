package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Car;

import java.util.List;

public interface ICarDB {
    List<Car> getCars();
    boolean rentCar(String plate);
}
