public class Card implements Comparable<Card>{
    public enum Value {
        //Card values
        KING(13),QUEEN(12),JACK(11),TEN(10),NINE(9),EIGHT(8),SEVEN(7),SIX(6),FIVE(5),FOUR(4),THREE(3),TWO(2),ACE(1);
        private int num;

        Value(int n){num = n;}
        int getNum() {return num;}
    }

    Value value;

    public enum Suit{
        //Suits
        HEARTS("Hearts"),CLUBS("Clubs"),SPADES("Spades"),DIAMONDS("Diamonds");
        private String suit;

        Suit(String s){suit = s;}
        String getSuit() {return suit;}
    }

    Suit suit;

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Value: " + value + "\tSuit: " + suit.getSuit();
    }

    @Override
    public int compareTo(Card o) {
        if (this.value.getNum() > o.value.getNum()) {
            return 1;
        }
        if (this.value.getNum() < o.value.getNum()) {
            return -1;
        }
        return 0;
    }
}
