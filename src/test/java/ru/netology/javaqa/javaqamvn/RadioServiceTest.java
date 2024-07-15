package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioServiceTest {


    @Test
    public void volumeTest() {
        Radio radio = new Radio(1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void stationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int expectedStation = 1;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void stationMinTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int expectedStation = 2;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void stationMaxTest() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.nextStation();
        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void stationDecreaseTest() {
        Radio radio = new Radio(9);
        radio.prevStation();
        int expected = 8;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expected, actualStation);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio(10);
        radio.setNumberStation(10);
        radio.prevStation();
        int expected = 9;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expected, actualStation);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expectedVolume = 100;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expectedVolume = 100;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void volumeReducingTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reducingVolume();
        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);

    }

    @Test
    public void reducingVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reducingVolume();
        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void reducingVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reducingVolume();
        int expectedVolume = 99;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void volumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void volumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void stationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void stationLessMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void prevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expectedStation = 10;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void prevStationLessMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();
        int expectedStation = 10;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void prevStationMoreMax() {
        Radio radio = new Radio(11);
        radio.setCurrentStation(11);
        radio.prevStation();
        int expectedStation = 10;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void prevStationMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        int expectedStation = 0;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void prevStationNorm() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();
        int expectedStation = 6;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

    @Test
    public void prevStationMoreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(75);
        radio.prevStation();
        int expectedStation = 10;
        int actualStation = radio.getCurrentStation();
        Assertions.assertEquals(expectedStation, actualStation);
    }

}

