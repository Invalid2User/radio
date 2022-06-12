package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "-2,0",
            "0,0",
            "15,0",
            "9,9",
            "10,0"
    })
    void setter(int setStation, int expected) {
        Radio serv = new Radio();
        serv.setCurrentStation(setStation);
        int actual = serv.getCurrentStation();

        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "5,6",
            "9,0",
    })
    void next(int setStation, int expected) {
        Radio serv = new Radio();
        serv.setCurrentStation(setStation);
        serv.nextStation();
        int actual = serv.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5,4",
            "9,8",
            "0,9"
    })
    void prev(int setStation, int expected) {
        Radio serv = new Radio();
        serv.setCurrentStation(setStation);
        serv.previousStation();
        int actual = serv.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5,6",
            "9,10",
            "10,10",
            "1,2"
    })
    void increasingVolume(int volume, int expected) {
        Radio serv = new Radio();
        serv.setVolume(volume);
        serv.volumeUp();
        int actual = serv.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,8",
            "10,9",
            "0,0",
            "1,0"
    })
    void decreasingVolume(int volume, int expected) {
        Radio serv = new Radio();
        serv.setVolume(volume);
        serv.volumeDown();
        int actual = serv.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
