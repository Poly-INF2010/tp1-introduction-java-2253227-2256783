package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        double radiusX = widthDiameter / 2.0;
        double radiusY = heightDiameter / 2.0;
        for(double y = -radiusY; y <= radiusY; y += 1.0){
            double x = Math.sqrt((Math.pow(radiusX, 2) - (((Math.pow(radiusX,2))*(Math.pow(y,2)))/(Math.pow(radiusY,2)))));
            for(double newX = -x; newX <= x; newX += 1.0 ){
                Point2d newPoint = new Point2d(newX, y);
                this.add(newPoint);
            }
        }

    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super((coords));
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(cloneCoords());
    }
}
