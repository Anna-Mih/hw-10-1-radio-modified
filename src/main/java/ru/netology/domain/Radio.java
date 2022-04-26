package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int quantityOfStations = 10;

    public Radio(int quantityOfStations) {
        this.quantityOfStations = quantityOfStations;
    }

    public Radio() {

    }

    public int getQuantityOfStations() {
        return quantityOfStations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation < quantityOfStations - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;

        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = quantityOfStations - 1;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > quantityOfStations - 1) {
            return;
        }
        this.currentStation = currentStation;
    }
}
