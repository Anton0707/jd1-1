package lesson7;

/**
 * Created by admin on 6/26/17.
 */
public class Rectangle extends Parallelogram implements Diagonable {
    private int sideA;
    private int sideB;

    public Rectangle() {

    }

    public Rectangle(int SideA, int SideB) {
        this.sideA = SideA;
        this.sideB = SideB;
    }

    @Override
    public int getSideA() {
        return sideA;
    }

    @Override
    public int getSideB() {
        return sideB;
    }

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }

    @Override
    public int getPerimetr() {
        return (sideA + sideB) * 2;
    }

    @Override
    public int getSquare() {
        return sideA * sideB;
    }

    @Override
    public int getDiagonal() {
        return (int) (Math.sqrt(sideA * sideA + sideB * sideB));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
