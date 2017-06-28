package lesson3;

import java.util.Random;

/**
 * Created by admin on 6/18/17.
 */
public class HomeTask3_9 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        isSimple(number);
    }

    public static void isSimple(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                System.out.println(number + " is not Simple");
                break;
            }else {
                System.out.println(number + " is Simple");
                break;
            }
        }
        if(number == 0) {
            System.out.println(number + " is not Simple");
        }
        if(number == 1) {
            System.out.println(number + " is Simple");
        }
    }

}
