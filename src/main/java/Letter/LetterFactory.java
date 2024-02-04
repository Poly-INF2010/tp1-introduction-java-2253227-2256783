package Letter;

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
        BaseShape a = new BaseShape();
        return a;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape b = new BaseShape();
        return b;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape c = new BaseShape();
        return c;    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape e = new BaseShape();
        return e;    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape h = new BaseShape();
        return h;    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape n = new BaseShape();
        return n;    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape o = new BaseShape();
        return o;    }

}
