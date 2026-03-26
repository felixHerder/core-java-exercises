package org.example.ch04inheritance;

public class Line extends Shape {
    private final Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point(point.x + to.x / 2, point.y + to.y);
    }
}
