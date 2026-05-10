package org.example.ch02oop;
/**
 * A <code>PointRecord</code> record object represents a point in 2d Cartesian space.
 *
 * @param x the x-axis coordinates
 * @param y the y-axis coordinates
 */
public record PointRecord(double x, double y) {
    /**
     * Applies a translation the point coordinates and returns a new PointRecord
     * @param amountX translates along the x-axis
     * @param amountY translates along the y-axis
     * @return the new translated point
     */
    public PointRecord translate(long amountX, long amountY) {
        return new PointRecord(this.x + amountX, this.y + amountY);
    }

    /**
     * Applies in place scale to the point coordinates by returning a new PointRecord
     * @param amount scales both coordinates along each axis
     * @return the new scaled point
     */
    public PointRecord scale(long amount) {
        return new PointRecord(this.x * amount, this.y * amount);
    }
}
