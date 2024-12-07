package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void nextStationTest(int currentStation, int expected) {
        Radio next = new Radio();
        next.setCurrentStation(currentStation);
        next.nextStation();
        int actual = next.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStation.scv")
    public void prevStationTest(int currentStation, int expected) {
        Radio prev = new Radio();
        prev.setCurrentStation(currentStation);
        prev.prevStation();
        int actual = prev.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void increaseVolumeTest(int currentVolume, int expected) {
        Radio inc = new Radio();
        inc.setCurrentVolume(currentVolume);
        inc.increaseVolume();
        int actual = inc.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/reduceVolume.csv")
    public void reduceVolumeTest(int currentVolume, int expexted) {
        Radio red = new Radio();
        red.setCurrentVolume(currentVolume);
        red.reduceVolume();
        int actual = red.getCurrentVolume();
        Assertions.assertEquals(expexted, actual);
    }
}

