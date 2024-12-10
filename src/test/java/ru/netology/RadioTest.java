package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/nextStationWithSize.csv")
    public void switchNextStationsWithSize(int size, int currentStation, int expected) {
        Radio service = new Radio(size);
        service.setCurrentStation(currentStation);
        service.nextStation();
        Assertions.assertEquals(expected, service.getCurrentStation());
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStationWithSize.csv")
    public void switchPrevStationsWithSize(int size, int currentStation, int expected) {
        Radio service = new Radio(size);
        service.setCurrentStation(currentStation);
        service.prevStation();
        Assertions.assertEquals(expected,service.getCurrentStation());
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void nextStationTest(int currentStation, int expected) {
        Radio service = new Radio();
        service.setCurrentStation(currentStation);
        service.nextStation();
        Assertions.assertEquals(expected, service.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStation.scv")
    public void prevStationTest(int currentStation, int expected) {
        Radio service = new Radio();
        service.setCurrentStation(currentStation);
        service.prevStation();
        Assertions.assertEquals(expected, service.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void increaseVolumeTest(int currentVolume, int expected) {
        Radio service = new Radio();
        service.setCurrentVolume(currentVolume);
        service.increaseVolume();
        Assertions.assertEquals(expected, service.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/reduceVolume.csv")
    public void reduceVolumeTest(int currentVolume, int expected) {
        Radio service = new Radio();
        service.setCurrentVolume(currentVolume);
        service.reduceVolume();
        Assertions.assertEquals(expected, service.getCurrentVolume());
    }
}

