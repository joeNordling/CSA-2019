public class Card {

    private String suit;

    private String rank;

    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) {
        
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
        
    }

    public String suit() {
        return this.suit;
   }

    public String rank() {
        return this.rank;
    }

    public int pointValue() {
        return this.pointValue;
    }

    public boolean matches(Card otherCard) {
        return true;
    }

    @Override
    public String toString() {
        String str;
        str = rank + " of " + suit + "(point value = " + pointValue + ")";
        return str;
    }
}
