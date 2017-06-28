package lesson3;

import java.util.Collection;

/**
 * Created by admin on 6/14/17.
 */
public class HomeTask3_3 {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 7, 8, 32, 34, 4, 6, 12};

        int indexMin = 0;
        int min = array[0];
        int indexMax = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] >= max) {
                max = array[i];
                indexMax = i;
            }
        }
        int sum = 0;
        if (indexMin < indexMax) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum += array[i];
            }
        } else {
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
