import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by leon on 3/23/17.
 */
public class Deck {
    private String[] cards = new String[]{"Ace of Clubs", "Two of Clubs", "Three of Clubs", "Four of Clubs", "Five of Clubs", "Six of Clubs", "Seven of Clubs", "Eight of Clubs", "Nine of Clubs", "Ten of Clubs", "Jack of Clubs", "Queen of Clubs", "King of Clubs", "Ace of Diamond", "Two of Diamond", "Three of Diamond", "Four of Diamond", "Five of Diamond", "Six of Diamond", "Seven of Diamond", "Eight of Diamond", "Nine of Diamond", "Ten of Diamond", "Jack of Diamond", "Queen of Diamond", "King of Diamond", "Ace of Heart", "Two of Heart", "Three of Heart", "Four of Heart", "Five of Heart", "Six of Heart", "Seven of Heart", "Eight of Heart", "Nine of Heart", "Ten of Heart", "Jack of Heart", "Queen of Heart", "King of Heart", "Ace of Spade", "Two of Spade", "Three of Spade", "Four of Spade", "Five of Spade", "Six of Spade", "Seven of Spade", "Eight of Spade", "Nine of Spade", "Ten of Spade", "Jack of Spade", "Queen of Spade", "King of Spade",};

    public List<String> shuffle() {
        List<String> deckOfCards = new ArrayList<>();
        Random rnd = ThreadLocalRandom.current();
        for (int i = cards.length - 1; i > 0; i--) {
            deckOfCards.add(cards[rnd.nextInt(i + 1)]);
        }
        return deckOfCards;
    }

    public List<List<String>> deal(int hands) {
        int count = 0, noOfCard;
        List<String> cards = this.shuffle();

        List<List<String>> finalHand = new ArrayList<>();
        for (int i = 0; i < hands; i++) {
            noOfCard = count;
            List<String> c = new ArrayList<>();
            for (int j = count; j < noOfCard + 5; j++, count++) {
                c.add(cards.get(j));
            }
            finalHand.add(c);
        }
        return finalHand;
    }
}
