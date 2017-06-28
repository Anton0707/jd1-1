package lesson7;

/**
 * Created by admin on 6/26/17.
 */
public class Triangle extends Shape {

    private int sideA;
    private int sideB;

    public int getHypotenuse(){
        return (int) Math.sqrt((sideA * sideA) + (sideB * sideB));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("drawing triangle");
    }

    @Override
    public int getSquare() {
        return (sideA * sideB) / 2;
    }

    @Override
    public int getPerimetr() {
        return (int) ((sideA + sideB) + getHypotenuse());
    }
}
