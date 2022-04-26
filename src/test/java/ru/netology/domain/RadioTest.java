package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeUpLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeDownLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(45);
        radio.nextStation();
        int expected = 46;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationUpLimit() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prevStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationDownLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationBelowMin() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationOverMax() {
        Radio radio = new Radio(70);
        radio.setCurrentStation(77);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-9);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldUseConstructor() {
        Radio radio = new Radio(30);
        assertEquals(30, radio.getQuantityOfStations());
    }

    @Test
    void shouldUseNoArgsConstructor() {
        Radio radio = new Radio();
        assertEquals(10, radio.getQuantityOfStations());
    }
}