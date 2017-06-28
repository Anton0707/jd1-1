package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 6/14/17.
 */
public class HomeTask2_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int year = Integer.parseInt(reader.readLine());

        if(day <= 0 ) {
            System.out.println("Неправильный день");
        }else if(month <= 0 && month > 12) {
            System.out.println("Неправильный месяц");
        }else if(year <= 0 && year > 2017) {
            System.out.println("Неправильный год");
        }else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day > 31) {
                        System.out.println("Неправильный день");
                    }else {
                        System.out.println(day + "/" + month + "/" + year);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day > 30) {
                        System.out.println("Неправильный день");
                    }else {
                        System.out.println(day + "/" + month + "/" + year);
                    }
                    break;
                case 2:
                    if (year % 4 == 0) {
                        if ((year % 100 == 0) && !(year % 400 == 0)) {
                            if (day > 28) {
                                System.out.println("Неправильный день");
                            }else {
                                System.out.println(day + "/" + month + "/" + year);
                            }
                        } else {
                            if (day > 29) {
                                System.out.println("Неправильный день");
                            }else {
                                System.out.println(day + "/" + month + "/" + year);
                            }
                        }
                    }
                    break;
                }
            }
        }
    }

