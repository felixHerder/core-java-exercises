package org.example.ch02oop;

/*
 * Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.
 * Provide methods to drive by a given number of miles, to add a given number of gallons to the gas tank,
 * and to get the current distance from the origin and fuel level.
 * Specify the fuel efficiency (in miles/gallons) in the constructor. Should this be an immutable class? Why or why not?
 */

/*
 * It can't be a record/immutable class because it requires non-final private instance variables.
 */

/**
 * Represent a Car abstraction that can be driven.
 */
public class Ex10Car {
    /* The fuel level of the car */
    private double fuel = 0;

    /* The fuel efficiency the car was built with (miles/gallon). */
    private final double fuelEfficiency;

    /* The total miles the car has been driven since being constructed. */
    private double milesDriven = 0;

    /**
     * Constructs a car with a specified fuel efficiency.
     * @param fuelEfficiency The car fuel efficiency in miles/gallon.
     */
    public Ex10Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    /**
     * Drives the car the specified distance, consuming fuel.
     * If fuel is insufficient it will drive until fuel is 0.
     * @param miles The distance the car is to be driven.
     */
    public void drive(double miles) {
        double requiredFuel = miles / fuelEfficiency;
        if(fuel >= requiredFuel) {
            milesDriven += miles;
            fuel -= requiredFuel;
        } else {
            milesDriven += fuel * fuelEfficiency;
            fuel = 0;
        }
    }

    /**
     * Adds fuel to the cars tank.
     * @param gallons The amount of fuel to be added; must be non-negative.
     */
    public void addFuel(double gallons) {
        if(gallons < 0) {
            return;
        }
        fuel += gallons;
    }

    /**
     * Gets the current fuel level.
     * @return the amount of fuel.
     */
    public double getFuel() {
        return fuel;
    }

    /**
     * Gets the total distance driven.
     * @return the distance driven in miles.
     */
    public double getDistance() {
        return milesDriven;
    }
}
