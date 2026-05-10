package org.example.ch04inheritance;

import java.util.Objects;

public class Point implements Cloneable {
    protected double x;
    protected double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point: "
                + "x: " + x
                + " | y: " + y;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null || this.getClass() != otherObject.getClass()) {
            return false;
        }

        var other = (Point) otherObject;
        return Double.compare(x, other.getX()) == 0 &&
                Double.compare(y, other.getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}
