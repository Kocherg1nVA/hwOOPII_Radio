package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/nextStation.csv")
    public void shouldSwitchNextStation(int currentStation, int expected) {
        Radio service = new Radio(20, 0, 19, 0, 0, 100, 0);
        service.setCurrentStation(currentStation);
        service.nextStation();
        Assertions.assertEquals(expected, service.getCurrentStation());
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStation.csv")
    public void shouldSwitchPrevStations(int currentStation, int expected) {
        Radio service = new Radio(15, 0, 14, 0, 0, 100, 0);
        service.setCurrentStation(currentStation);
        service.prevStation();
        Assertions.assertEquals(expected,service.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void increaseVolumeTest(int currentVolume, int expected) {
        Radio service = new Radio(10, 0, 9, 0, 0, 100, 0);
        service.setCurrentVolume(currentVolume);
        service.increaseVolume();
        Assertions.assertEquals(expected, service.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/reduceVolume.csv")
    public void reduceVolumeTest(int currentVolume, int expected) {
        Radio service = new Radio(10, 0, 9, 0, 0, 100, 0);
        service.setCurrentVolume(currentVolume);
        service.reduceVolume();
        Assertions.assertEquals(expected, service.getCurrentVolume());
    }
}

