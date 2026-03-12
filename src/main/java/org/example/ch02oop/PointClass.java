package org.example.ch02oop;

/**
 * A <code>PointClass</code> object represents a point in 2d Cartesian space.
 */
public class PointClass {
    private double x;
    private double y;

    /**
     * Creates a new PointClass
     * @param x the x-axis coordinates
     * @param y the y-axis coordinates
     */
    public PointClass(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Applies in place translation to the point coordinates
     * @param amountX translates along the x-axis
     * @param amountY translates along the y-axis
     */
    public void translate(long amountX, long amountY) {
        this.x += amountX;
        this.y += amountY;
    }

    /**
     * Applies in place scale to the point coordinates
     * @param amount scales both coordinates along each axis
     */
    public void scale(long amount) {
        this.x *= amount;
        this.y *= amount;
    }

    @Override
    public String toString() {
        return this.x + "---" + this.y;
    }
}
