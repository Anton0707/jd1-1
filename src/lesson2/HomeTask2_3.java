package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 6/14/17.
 */
public class HomeTask2_3 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if(a == 0){
            while (a == 0){
                System.out.println("Значение а не верно, введите заново");
                a = Integer.parseInt(reader.readLine());
            }
        }
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if(discriminant(a,b,c) > 0){
            System.out.println((-b - (Math.sqrt(discriminant(a,b,c)))) / (2 * a) + ", " +
                    (-b + (Math.sqrt(discriminant(a,b,c)))) / (2 * a));
        }else if(discriminant(a,b,c) == 0){
            System.out.println((-b) / (2 * a));
        }else if(discriminant(a,b,c) < 0){
            System.out.println("Корней нет");
        }
    }
    public static boolean isPositive(int x){
        if(x > 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isZero(int x){
        if(x == 0){
            return true;
        }else{
            return false;
        }
    }
    public static double discriminant(int a,int b, int c){
        return ((b*b) - (4*a*c));
    }
}
