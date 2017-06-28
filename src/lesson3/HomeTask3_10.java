package lesson3;

/**
 * Created by admin on 6/18/17.
 */
public class HomeTask3_10 {
    public static void main(String[] args) {
        factorial(1);

    }

    public static void factorial(int number) {
        int numb = 1;
        for (int i = 2; i <= number; i++) {
            numb *= i;
        }

        System.out.println(numb);
    }
}
