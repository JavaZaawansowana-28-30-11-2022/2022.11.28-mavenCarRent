package com.comarch.szkolenia.car.rent.model;

public class Car {
    private String brand;
    private String model;
    private double price;
    private boolean rent;
    private String plate;

    public Car(String brand, String model, double price,
               boolean rent, String plate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.rent = rent;
        this.plate = plate;
    }

    public Car(String brand, String model, double price, String plate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.rent = false;
        this.plate = plate;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.brand)
                .append(" ")
                .append(this.model)
                .append(" Price: ")
                .append(this.price)
                .append(" Plate: ")
                .append(this.plate)
                .append(" Available: ")
                .append(this.rent ? "No" : "Yes")
                .toString();
    }
}
