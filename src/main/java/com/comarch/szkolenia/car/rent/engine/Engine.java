package com.comarch.szkolenia.car.rent.engine;

import com.comarch.szkolenia.car.rent.database.CarDB;
import com.comarch.szkolenia.car.rent.database.CarDB2;
import com.comarch.szkolenia.car.rent.database.ICarDB;
import com.comarch.szkolenia.car.rent.gui.GUI;
import com.comarch.szkolenia.car.rent.gui.IGUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine implements IEngine {
    @Autowired
    @Qualifier("carDB2")
    private ICarDB carDB;
    @Autowired
    private IGUI gui;
    //private static final Engine instance = new Engine();

    /*private Engine() {
    }*/

    @Override
    public void start() {
        String choose;
        do {
            choose = gui.showMenu();
            switch (choose) {
                case "1":
                    gui.listCars();
                    break;
                case "2":
                    gui.showRentResult(carDB.rentCar(gui.readPlate()));
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Wrong choose !!");
                    break;
            }
        } while (!choose.equals("3"));
    }

    /*public static Engine getInstance() {
        return instance;
    }*/
}
