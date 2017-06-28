package lesson7;

/**
 * Created by admin on 6/26/17.
 */
public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }

    @Override
    public int getSquare() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int getPerimetr() {
        return (int) (2 * Math.PI * radius);
    }
}
