package org.example.ch02oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TimeOfDayTest {

    @Test
    void TimeOfDay_NormalizeLargeValues() {
        TimeOfDay result = new TimeOfDay(244, 195);
        TimeOfDay expected = new TimeOfDay(7, 15);
        assertEquals(expected, result);
    }

    @Test
    void plusMinutes_returnsCorrectTimeOfDay() {
        TimeOfDay t1 = new TimeOfDay(2, 32);
        TimeOfDay result = t1.plusMinutes(240);
        TimeOfDay expected = new TimeOfDay(6, 32);
        assertEquals(expected, result);
    }

    @Test
    void minutesFrom_returnMinutes() {
        TimeOfDay t1 = new TimeOfDay(20, 50);
        TimeOfDay t2 = new TimeOfDay(23, 55);
        int expectedMinutes = 185;
        int result = t1.minutesFrom(t2);
        assertEquals(expectedMinutes, result);
    }
}