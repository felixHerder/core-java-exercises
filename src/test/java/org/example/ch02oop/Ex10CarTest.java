package org.example.ch02oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex10CarTest {
    double fuelEfficiency = 40;
    Ex10Car testCar;

    @BeforeEach
    void setup() {
        testCar = new Ex10Car(fuelEfficiency);
    }

    @Test
    void addFuel_NonNegativeAmount() {
        double expected = 59;
        testCar.addFuel(expected);
        assertEquals(expected, testCar.getFuel());
    }

    @Test
    void addFuel_NegativeAmount() {
        double fuel = -20;
        testCar.addFuel(fuel);
        assertEquals(0, testCar.getFuel());
    }

    @Test
    void drive_withEnoughFuel() {
        double fuel = 50;
        testCar.addFuel(fuel);
        double distance = 30;
        double expectedFuel = fuel - distance / fuelEfficiency;

        testCar.drive(distance);

        assertEquals(expectedFuel, testCar.getFuel());
        assertEquals(distance,testCar.getDistance());
    }

    @Test
    void drive_withoutEnoughFuel() {
        double fuel = 0.5;
        testCar.addFuel(fuel);
        double distance = 30;
        double expectedDistance = fuel * fuelEfficiency;

        testCar.drive(distance);

        assertEquals(0, testCar.getFuel());
        assertEquals(expectedDistance, testCar.getDistance());
    }
}
