package lesson7;

/**
 * Created by admin on 6/26/17.
 */
public abstract class Shape {

    protected int x;
    protected int y;

    public Shape() {

    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public abstract int getSquare();

    public abstract int getPerimetr();
}
