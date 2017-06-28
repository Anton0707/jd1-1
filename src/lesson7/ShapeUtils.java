package lesson7;

/**
 * Created by admin on 6/28/17.
 */
public class ShapeUtils {
    public static boolean isRectangle(Shape shape) {
        if (shape instanceof Rectangle) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTriangle(Shape shape) {
        if (shape instanceof Triangle) {
            return true;
        } else {
            return false;
        }
    }
}
