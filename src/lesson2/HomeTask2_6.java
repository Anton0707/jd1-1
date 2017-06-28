package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 6/14/17.
 */
public class HomeTask2_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if(number % 4 == 0){
            if((number % 100 == 0) && !(number % 400 == 0)){
                System.out.println(number + " не високосный");
            }else {
                System.out.println(number + " високосный");
            }
        }
    }
}
