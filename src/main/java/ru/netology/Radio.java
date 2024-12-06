package ru.netology;

public class Radio {

    public int currentStation; // текущая станция
    public int currentVolume; // текущий уровень громкости

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextStation(int newCurrentStation) {

        if (newCurrentStation < 0 | newCurrentStation > 9)
            return;
        if (newCurrentStation >= 0)
            currentStation = newCurrentStation + 1;
        if (newCurrentStation == 9)
            currentStation = 0;
    }

    public void setPrevStation(int newCurrentStation) {

        if (newCurrentStation < 0 | newCurrentStation > 9)
            return;
        if (newCurrentStation > 0)
            currentStation = newCurrentStation - 1;
        if (newCurrentStation == 0)
            currentStation = 9;
    }

    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0 | newCurrentVolume > 100)
            return;
        if (newCurrentVolume < 100)
            currentVolume = newCurrentVolume + 1;
    }

    public void reduceVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0 | newCurrentVolume > 100)
            return;
        if (newCurrentVolume > 0)
            currentVolume = newCurrentVolume - 1;
    }
}
