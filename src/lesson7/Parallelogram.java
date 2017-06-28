package lesson7;

/**
 * Created by admin on 6/26/17.
 */
public class Parallelogram extends Shape {
    private int sideA;
    private int sideB;
    private int height;

    public Parallelogram() {

    }

    public Parallelogram(int SideA, int SideB, int height) {
        this.sideA = SideA;
        this.sideB = SideB;
        this.height = height;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {

        return sideA;
    }

    public int getSideB() {
        return sideB;
    }


    @Override
    public void draw() {
        System.out.println("drawing parallelogram");
    }

    @Override
    public int getPerimetr() {
        return (sideA + sideB) * 2;
    }

    @Override
    public int getSquare() {
        return sideA * height;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
