package lesson7;

/**
 * Created by admin on 6/26/17.
 */
public class Demonstration {
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(2, 5, 4);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(5);

        System.out.println(parallelogram);
        System.out.println(parallelogram.getPerimetr());
        System.out.println(rectangle.getPerimetr());
        System.out.println(ShapeUtils.isRectangle(square));
        System.out.println(ShapeUtils.isTriangle(square));
    }
}
