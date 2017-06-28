package lesson3;

/**
 * Created by admin on 6/15/17.
 */
public class HomeTask3_6 {


    public static void main(String[] args) {
        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(equals(array1,array2));

    }


    public static boolean equals(int[][] a, int[][] b) {
        boolean isEqual = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    isEqual = false;
                    break;
                } else{
                    isEqual = true;
                }
            }
        }
        return isEqual;
    }
}
