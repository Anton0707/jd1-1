package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 6/14/17.
 */
public class HomeTask2_5_b {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        switch (number){
            case 1:
                System.out.println(number + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(number + " рубля");
                break;
            case 5:
                System.out.println(number + " рублей");
                break;
            case 0:
            default:
                System.out.println(number + " рублей");
                break;
        }
    }
}
