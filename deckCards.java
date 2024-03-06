import java.util.Random;

public class DeckOfCards {

    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the cards
        shuffle(deck);

        // Display the first 4 cards
        for (int i = 0; i < 4; i++) {
            int cardNumber = deck[i];
            String suit = suits[cardNumber / 13];
            String rank = ranks[cardNumber % 13];
            System.out.println(rank + " of " + suit);
        }
    }

    // Fisher-Yates shuffle algorithm
    public static void shuffle(int[] deck) {
        Random rnd = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }
}
