/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {
    /**
     * String value that holds the suit of the card
     */
    private String suit;
    /**
     * String value that holds the rank of the card
     */
    private String rank;
    /**
     * int value that holds the point value.
     */
    private int pointValue;
    /**
     * Creates a new <code>Card</code> instance.
     *
     * @param cardRank  a <code>String</code> value
     *                  containing the rank of the card
     * @param cardSuit  a <code>String</code> value
     *                  containing the suit of the card
     * @param cardPointValue an <code>int</code> value
     *                  containing the point value of the card
     */
    public Card(String cardRank, String cardSuit, int cardPointValue) {
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;        
    }

    public void makeCard()
    {
        String [] deck = {"2","3","4","5","6","7","8","9","J","Q","K", "A"};
        String [] suit = {"clubs", "diamonds", "hearts", "spades"};
        
        int cr =  (int)(Math.random()*13 );
        String cardRank = deck[cr];
        
        int cs =  (int)(Math.random()*4 );
        String cardSuit = deck[cs];
        
        if (cardRank.equals("J") || cardRank.equals("Q") || cardRank.equals("K")) {
          int cardPointValue = 10;
        }
        else if (cardRank.equals("2") || cardRank.equals("3") || cardRank.equals("4") ||
                 cardRank.equals("5") || cardRank.equals("6") || cardRank.equals("7") ||
                 cardRank.equals("8") || cardRank.equals("9")) {
          int cardPointValue = Integer.parseInt(cardRank);
          } 
        else {
          int cardPointValue = 11;
        }
    }
    
    /**
     * Accesses this <code>Card's</code> suit.
     * @return this <code>Card's</code> suit.
     */
    public String suit() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return this.suit;
    }
    
    /**
     * Accesses this <code>Card's</code> rank.
     * @return this <code>Card's</code> rank.
     */
    public String rank() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return this.rank;
    }
    
    /**
     * Accesses this <code>Card's</code> point value.
     * @return this <code>Card's</code> point value.
     */
    public int pointValue() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return this.pointValue;
    }
    
    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
    public boolean matches(Card otherCard) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return true;
    }
    
    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        String str;
        str = rank + " of " + suit + "(point value = " + pointValue + ")";
        return str;
    }
}
