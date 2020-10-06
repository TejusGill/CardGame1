package pickacard;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Tejus Singh Gill
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
       
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
             c.setValue(random.nextInt(13) + 1);
             c.setSuit(Card.SUITS[random.nextInt(4)]);

           
            magicHand[i] = c;
        }
        String format = "%d of %s \n";
        for(Card c : magicHand){
            System.out.printf(format, c.getValue(), c.getSuit());
        }
        System.out.println("Please choose the suit");

        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);

        }

        int suit = in.nextInt();

        System.out.println("Please choose the value(1 -13)");
        int value = in.nextInt();

        Card userGuess = new Card();
        boolean match = false;

        for (Card card : magicHand) {
            if (card.getValue() == userGuess.getValue()
                    && card.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }
        }

        System.out.println("You got a match: " + match);
      // I edit directly on github
    }

}
