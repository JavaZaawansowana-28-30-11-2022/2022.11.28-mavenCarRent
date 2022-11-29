package com.comarch.szkolenia.car.rent.gui;

public interface IGUI {
    String showMenu();
    void listCars();
    String readPlate();
    void showRentResult(boolean rentResult);
}
