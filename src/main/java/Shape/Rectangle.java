package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        double halfWidth = width / 2.0;
        double halfHeight = height / 2.0;
        for(double y = -halfHeight; y <= halfHeight; y += 1.0){
            for(double x = -halfWidth ; x <= halfWidth; x += 1.0 ) {
                Point2d newPoint = new Point2d(x, y);
                this.add(newPoint);
            }
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(cloneCoords());
    }
}
