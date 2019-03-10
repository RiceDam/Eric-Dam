import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> deck = new LinkedList<>();

    public Deck(){
        //Creates deck of cards
        for(Card.Value v: Card.Value.values()) {
            for(Card.Suit s: Card.Suit.values()) {
                Card c = new Card(v,s);
                deck.add(c);
            }
        }
    }

    public Deck(Collection<Card> c) {
        this.deck = new LinkedList<>(c);
    }

    public void displayDeck() {
        //Prints out card in deck
        for(Card c: deck) {
            System.out.println(c);
        }
    }

    public void shuffle() {
        //Shuffles the deck
        Collections.shuffle(deck);
    }

    public void drawCard() {
        //draws a card from the top
        System.out.println(deck.poll());
    }

    public void numOfCards() {
        //Number of cards left
        int count = 0;
        for(Card c: deck) {
            count++;
        }
        System.out.println(count);
    }

    public void deal(int players, int cardsPerPlayer) {
        //Deals cards to certain amount of players
        LinkedList<Deck> playerHand = new LinkedList<>();
        LinkedList<Card> tempDeck = new LinkedList<>(deck);
        int firstIndex = 0;
        int lastIndex;
        for(int p = 0; p < players; p++) {
            lastIndex = firstIndex + cardsPerPlayer;
            playerHand.add(new Deck(tempDeck.subList(firstIndex, lastIndex)));
            firstIndex = lastIndex;
        }
        for(int k = 0; k < players*cardsPerPlayer; k++) {
            deck.remove(0);
        }
        for(Deck d: playerHand) {
            System.out.println(d);
        }
    }

    @Override
    public String toString() {
        String cards = "";
        for (Card c: deck) {
            cards = cards.concat(c + System.lineSeparator());
        }
        return deck.size() + " cards: " + System.lineSeparator() + cards;
    }
}
