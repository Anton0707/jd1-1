package lesson3;

import java.util.Random;

/**
 * Created by admin on 6/17/17.
 */
public class HomeTask3_7 {
    public static void main(String[] args) {
        String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] card = {"Ace", "King", "Queen", "Jack", "10",
                "9", "8", "7", "6", "5", "4", "3", "2"};
        emulator(card, suit);
    }

    public static void emulator(String[] card, String[] suit) {
        Random random = new Random();
        int suitEmulator = random.nextInt(4);
        int cardEmulator = random.nextInt(13) ;
        System.out.println(card[cardEmulator] + " of " + suit[suitEmulator]);
    }
}
