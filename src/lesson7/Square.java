package lesson7;

/**
 * Created by admin on 6/26/17.
 */
public class Square extends Rectangle {
    private int side;

    public Square() {

    }

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {

        return side;
    }

    @Override
    public void draw() {
        System.out.println("drawing square");
    }

    @Override
    public int getPerimetr() {
        return side * 2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public int getSquare() {
        return side * side;
    }

    @Override
    public int getDiagonal() {
        return (int) (side * Math.sqrt(2));
    }
}
