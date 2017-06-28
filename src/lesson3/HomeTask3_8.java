package lesson3;

import java.util.Random;

/**
 * Created by admin on 6/17/17.
 */
public class HomeTask3_8 {
    public static void main(String[] args) {
        String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] card = {"Ace", "King", "Queen", "Jack", "10",
                "9", "8", "7", "6", "5", "4", "3", "2"};
        for (String element: listOfDeck(card, suit)){
            System.out.println(element);
        }

    }

    public static String[] listOfDeck(String[] card, String[] suit) {
        String[] deck = new String[52];
        int index = 0;
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[index] = card[i] + " of " + suit[j];
                index++;
            }
        }
        Random random = new Random();
        for (int i = 1; i < deck.length; i++) {
            int j = random.nextInt(i);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        return deck;
    }
}
