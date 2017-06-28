package lesson5;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by admin on 6/28/17.
 */
public class HomeTask5_3 {
    private int x;
    private double y;
    private BigDecimal a;
    private BigDecimal b;

    public HomeTask5_3(int x, double y, BigDecimal a, BigDecimal b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public void Addition() {
        System.out.println(x + y);
        System.out.println(a.add(b));
    }

    public void Subtraction() {
        System.out.println(x - y);
        System.out.println(a.subtract(b));
    }

    public void Multyplication() {
        System.out.println(x * y);
        System.out.println(a.multiply(b));
    }

    public void Division() {
        if (y == 0) {
            System.out.println("Cannot divide to zero");
        } else {
            System.out.println(x / y);
        }
        System.out.println(a.subtract(b));

    }

    public static void main(String[] args) {
        HomeTask5_3 homeTask5_3 = new HomeTask5_3(2, 0.3, new BigDecimal(2), new BigDecimal(0.3));

        homeTask5_3.Addition();
        homeTask5_3.Subtraction();
        homeTask5_3.Multyplication();
        homeTask5_3.Division();
    }
}
