package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 6/14/17.
 */
public class HomeTask2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word1 = reader.readLine();
        String word2 = reader.readLine();
        if(word1.equals(word2)){
            System.out.println("Отлично! Слова одинаковы");
        }else if(!(word1.equals(word2)) && word1.equalsIgnoreCase(word2) ){
            System.out.println("Хорошо. Почти одинаковы");
        }else if(!(word1.equals(word2)) && word1.length() == word2.length() ){
            System.out.println("Ну, хотя бы они одной длины");
        }
    }
}
