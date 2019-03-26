import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Creates a new deck and shuffles it
        Deck d = new Deck();
        d.shuffle();
        d.displayDeck();
        d.numOfCards();
        System.out.println("----------------------------------------------------------------------------------------------------");
        //Draws card from deck
        d.drawCard();
        d.displayDeck();
        d.numOfCards();
        System.out.println("----------------------------------------------------------------------------------------------------");
        //Deals remaining cards
        d.deal(4,10);
        d.numOfCards();
        System.out.println("----------------------------------------------------------------------------------------------------");
        d.displayDeck();
        //Deck gets sorted by value
        Collections.sort(d.returnDeck());
        System.out.println("*************************SORTED****************************");
        d.displayDeck();
    }
}
