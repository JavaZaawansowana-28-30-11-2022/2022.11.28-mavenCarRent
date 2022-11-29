package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.database.CarDB;
import com.comarch.szkolenia.car.rent.database.CarDB2;
import com.comarch.szkolenia.car.rent.database.ICarDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class GUI implements IGUI {
    private Scanner scanner = new Scanner(System.in);
    @Autowired
    @Qualifier("carDB2")
    private ICarDB carDB;
    //private static final GUI instance = new GUI();

    /*private GUI() {
    }*/

    @Override
    public String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return this.scanner.nextLine();
    }

    @Override
    public void listCars() {
        this.carDB.getCars().forEach(System.out::println);
    }

    @Override
    public String readPlate() {
        System.out.println("Plate:");
        return this.scanner.nextLine();
    }

    @Override
    public void showRentResult(boolean rentResult) {
        System.out.println(rentResult ? "Rent success !!" : "Rent error !!");
    }

    /*public static GUI getInstance() {
        return instance;
    }*/
}
