package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        int newCurrentStation = currentStation + 1;
        if (newCurrentStation == 10) {
            currentStation = 0;
        } else {
            setCurrentStation(newCurrentStation);
        }
    }

    public void previousStation() {
        int newCurrentStation = currentStation - 1;
        if (newCurrentStation < 0) {
            currentStation = 9;
        } else {
            setCurrentStation(newCurrentStation);
        }
    }

    public void volumeUp() {
        int newCurrentVolume = currentVolume + 1;
        if (newCurrentVolume > 10) {
            return;
        } else {
            this.currentVolume = newCurrentVolume;
        }
    }

    public void volumeDown() {
        int newCurrentVolume = currentVolume - 1;
        if (newCurrentVolume < 0) {
            return;
        } else {
            this.currentVolume = newCurrentVolume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

}
