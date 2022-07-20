package ru.netology.radio;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Radio serv = new Radio(25);
        serv.volumeUp();
        serv.volumeUp();
        serv.volumeUp();
        serv.volumeUp();
        serv.volumeDown();
        serv.setCurrentStation(0);
        serv.previousStation();

        System.out.println("Station " + serv.getCurrentStation());

        System.out.println("Volume level " + serv.getCurrentVolume());
    }
}
