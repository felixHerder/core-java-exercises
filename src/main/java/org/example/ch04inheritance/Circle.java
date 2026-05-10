package org.example.ch04inheritance;

public class Circle extends Shape{
    private final double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    public double getRadius() {
        return radius;
    }
}
