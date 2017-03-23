import java.util.List;
import java.util.Scanner;
/**
 * Created by leon on 3/23/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        System.out.println("Please give the number of hands you want(Not more then 5 and not less then 2):");
        int hand = scanner.nextInt();
        if (hand >= 2 && hand <= 5) {
            List<List<String>> hands = deck.deal(hand);
            hands.forEach(System.out::println);
        } else {
            System.out.println("Wrong hand input.");
        }
    }
}
