package Letter;

import Interface.Rotate;
import Interface.Transform;
import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape A = new BaseShape();
        Rectangle diagonalBar = new Rectangle( halfStripeThickness, maxHeight+80);
        diagonalBar.rotate(diagonalBar.getCoords(),(Math.PI)/20);
        A.add(diagonalBar);
        diagonalBar.translate(diagonalBar.getCoords(),new Point2d(20.0,5.0));
        diagonalBar.rotate(diagonalBar.getCoords(),-(Math.PI)/10);
        A.add(diagonalBar);
        Rectangle horizontalBar = new Rectangle(halfMaxWidth,halfStripeThickness);
        horizontalBar.translate(horizontalBar.getCoords(),new Point2d(15.0,50.0));
        A.add(horizontalBar);
        Square overflow = new Square(maxHeight) ;
        overflow.translate(overflow.getCoords(), new Point2d(0.0, -(halfMaxHeight+35)));
        A.remove(overflow);
        return A;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape B = new BaseShape();
        Rectangle verticalBar = new Rectangle(stripeThickness, maxHeight);
        verticalBar.translate(verticalBar.getCoords(), new Point2d(-(halfMaxWidth-(stripeThickness/2)),0.0));
        B.add(verticalBar);
        Circle round = new Circle(halfMaxHeight);
        Circle hole = new Circle(halfMaxHeight -stripeThickness);
        round.remove(hole);
        round.translate(round.getCoords(),new Point2d(0.0, halfMaxHeight/2));
        B.add(round);
        round.translate(round.getCoords(),new Point2d(0.0, -maxHeight/2));
        B.add(round);
        verticalBar.translate(verticalBar.getCoords(), new Point2d(-stripeThickness,0.0));
        B.remove(verticalBar);
        return B;

    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse form = new Ellipse(maxWidth, maxHeight);
        Ellipse middle = new Ellipse(maxWidth - halfStripeThickness, maxHeight - halfStripeThickness);
        Rectangle rightSide = new Rectangle(halfMaxWidth, halfMaxHeight);
        rightSide.translate(rightSide.getCoords(), new Point2d(20.0, 0.0));
        form.remove(middle);
        form.remove(rightSide);
        return form;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape E = new BaseShape();
        Rectangle verticalBar = new Rectangle(halfStripeThickness, maxHeight);
        verticalBar.translate(verticalBar.getCoords(), new Point2d(-(halfMaxWidth-(halfStripeThickness/2)),0.0));
        E.add(verticalBar);
        Rectangle horizontalBar =  new Rectangle(maxWidth,halfStripeThickness);
        E.add(horizontalBar);
        horizontalBar.translate(horizontalBar.getCoords(), new Point2d(0.0,-(halfMaxHeight-(halfStripeThickness/2))));
        E.add(horizontalBar);
        horizontalBar.translate(horizontalBar.getCoords(), new Point2d(0.0,maxHeight-(halfStripeThickness/2)));
        E.add(horizontalBar);
        return E;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape H = new BaseShape();
        Rectangle verticalBar = new Rectangle(halfStripeThickness, maxHeight);
        verticalBar.translate(verticalBar.getCoords(), new Point2d(-(halfMaxWidth-(halfStripeThickness/2)),0.0));
        H.add(verticalBar);
        verticalBar.translate(verticalBar.getCoords(), new Point2d(maxWidth-(halfStripeThickness/2),0.0));
        H.add(verticalBar);
        Rectangle horizontalBar =  new Rectangle(maxWidth,halfStripeThickness);
        H.add(horizontalBar);
        return H;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape N = new BaseShape();
        Rectangle verticalBar = new Rectangle(halfStripeThickness, maxHeight);
        verticalBar.translate(verticalBar.getCoords(), new Point2d(-(halfMaxWidth - (halfStripeThickness / 2)), 0.0));
        N.add(verticalBar);
        verticalBar.translate(verticalBar.getCoords(), new Point2d(maxWidth - (halfStripeThickness / 2), 0.0));
        N.add(verticalBar);
        Rectangle middleBar = new Rectangle(halfStripeThickness, maxHeight);
        middleBar.rotate(middleBar.getCoords(), -(Math.PI) / 10);
        N.add(middleBar);
        return N;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse form = new Ellipse(maxWidth, maxHeight);
        Ellipse formToRemove = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);
        form.remove(formToRemove);
        return form;
    }
}
