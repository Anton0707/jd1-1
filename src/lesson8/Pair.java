package lesson8;

/**
 * Created by admin on 6/28/17.
 */
public class Pair<K, V> {
    public K x;
    public V y;

    public void setX(K x) {
        this.x = x;
    }

    public void setY(V y) {
        this.y = y;
    }

    public K getX() {

        return x;
    }

    public V getY() {
        return y;
    }

    public Pair(K x, V y) {
        this.x = x;
        this.y = y;

    }
}
