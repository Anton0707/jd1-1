package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 6/13/17.
 */
public class HomeTask2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a > b){
            int x = b;
            b = a;
            a = x;
        }
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        if (c > d){
            int x = d;
            d = c;
            c = x;
        }
        int e = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());
        if (e > f){
            int x = f;
            f = e;
            e = x;
        }

        checkSquare(a,b,c,d,e,f);
    }
    public static void checkSquare(int x1, int x2, int y1, int y2, int z1, int z2) {
        if(x2 <= y2){
            if(y2 < z2 && (x1 + y1) < z1){
                System.out.println("помещается");
            }else {
                System.out.println("не помещается");
            }
        }else {
            if (x2 < z2 && (x1 + y1) < z1) {
                System.out.println("помещается");
            }else {
                System.out.println("не помещается");
            }
        }
    }
}
