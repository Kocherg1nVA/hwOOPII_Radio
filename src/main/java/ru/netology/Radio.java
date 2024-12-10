package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int size; // количество радиостанций
    private int minStation; // номер первой станции
    private int maxStation; // номер последней станции
    private int currentStation; // текущая станция
    private int minVolume; // минимальный уровень громкости
    private int maxVolume; // максимальный уровень громкости
    private int currentVolume; // текущий уровень громкости

    public void nextStation() {
        if (currentStation < minStation | currentStation > maxStation) {
            currentStation = minStation;
            return;
        }
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void prevStation() {
        if (currentStation < minStation | currentStation > maxStation) {
            currentStation = minStation;
            return;
        }
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < minVolume | currentVolume > maxVolume){
            currentVolume = minVolume;
            return;
        }
        if (currentVolume == maxVolume) {
            return;
        }
            currentVolume = currentVolume + 1;
    }

    public void reduceVolume() {
        if (currentVolume < minVolume | currentVolume > maxVolume) {
            currentVolume = minVolume;
            return;
        }
        if (currentVolume == minVolume) {
            return;
        }
            currentVolume = currentVolume - 1;
    }
}

