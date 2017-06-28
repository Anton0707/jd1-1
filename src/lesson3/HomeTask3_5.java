package lesson3;

/**
 * Created by admin on 6/15/17.
 */
public class HomeTask3_5 {
    public static void main(String[] args) {
        char[][] array = new char[5][5];
        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i)))
                    array[i][j] = ' ';
                else
                    array[i][j] = '*';

            }

        }
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j < (array[i].length - 1 - i)) || (j > i))
                    array[i][j] = ' ';
                else
                    array[i][j] = '*';
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1) {
                    System.out.println(array[i][j]);
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
