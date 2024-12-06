package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void setNextStation(int currentStation, int expected) {
        Radio next = new Radio();
        next.setNextStation(currentStation);
        int actual = next.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStation.scv")
    public void setPrevStation(int currentStation, int expected) {
        Radio prev = new Radio();
        prev.setPrevStation(currentStation);
        int actual = prev.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void increaseVolumeTest(int currentVolume, int expected) {
        Radio inc = new Radio();
        inc.increaseVolume(currentVolume);
        int actual = inc.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/reduceVolume.csv")
    public void reduceVolumeTest(int currentVolume, int expexted) {
        Radio red = new Radio();
        red.reduceVolume(currentVolume);
        int actual = red.getCurrentVolume();
        Assertions.assertEquals(expexted, actual);
    }
}

