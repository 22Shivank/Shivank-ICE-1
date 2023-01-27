package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Shivank Panchhi
 * @author Shivank Panchhi Jan 26, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
             int value = (int) (Math.random() * 13) + 1;
            int suit = (int) (Math.random() * 4);
            hand[i] = new Card(value, Card.SUITS[suit]);

        }
            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter card value (1-13): ");
        int value = scanner.nextInt();
        System.out.println("Enter card suit (1-4): ");
        int suit = scanner.nextInt();
        Card userCard = new Card(value-1, Card.SUITS[suit-1]);

        // Search the hand for the user's card
        boolean found = false;
        for (Card c : hand) {
            if (c.equals(userCard)) {
                found = true;
                printInfo();
            }
        }
        
         if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, the card is not in the hand.");
}
        
    }

    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

    

}
