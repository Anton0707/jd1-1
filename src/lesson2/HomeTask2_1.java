package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 6/13/17.
 */
public class HomeTask2_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int year = Integer.parseInt(reader.readLine());
        formatString(day,month,year);
    }

    public static void formatString(int x, int y, int z){
        System.out.format("%d.%d.%d",x,y,z);
    }
}