package org.example.ch04inheritance;

public class Rectangle extends Shape {
    private final double width;
    private final double height;


    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
