package ru.netology.javaqa.javaqamvn;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int minStation = 0;
    private int maxStation = 10;
    private int numberStation = 10;


    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.maxStation = numberStation - 1;
    }


    public Radio() {

    }

    public int getNumberStation() {
        return numberStation;
    }

    public int setNumberStation(int numberStation) {
        this.numberStation = numberStation;
        return numberStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reducingVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}

