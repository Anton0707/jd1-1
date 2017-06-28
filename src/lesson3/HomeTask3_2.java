package lesson3;

/**
 * Created by admin on 6/14/17.
 */
public class HomeTask3_2 {
    public static void main(String[] args) {
        int counter = 0;
        int number = 1;
        while (number <= 100) {
            if ((number) % 13 == 0 || (number) % 17 == 0) {
                counter++;
                number++;
            } else {
                number++;
            }
        }

        int[] array = new int[counter];
        int index = 0;
        number = 1;
        while (number <= 100) {
            if ((number) % 13 == 0 || (number) % 17 == 0) {
                array[index] = number;
                index++;
                number++;
            } else {
                number++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
