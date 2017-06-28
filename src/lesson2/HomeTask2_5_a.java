package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 6/14/17.
 */
public class HomeTask2_5_a {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if(number == 1){
            System.out.println(number + " рубль");
        }else if(number == 0 || number >= 5){
            System.out.println(number + " рублей");
        }else if(number >= 2 && number <= 4){
            System.out.println(number + " рубля");
        }
    }
}
