package lesson3;

import java.util.Random;

/**
 * Created by admin on 6/15/17.
 */
public class HomeTask3_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(80) + 10;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("не является строго возрастающей последовательностью");
                break;
            } else {
                if (counter == array.length - 2) {
                    System.out.println("является строго возрастающей последовательностью");
                }
            }
            counter++;
        }
    }
}
