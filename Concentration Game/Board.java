public abstract class Board
{
    //The cards that will be placed in the tiles
    private String[] cards = new String[] {"dog", "dog", "cat", "cat", "mouse", "mouse",
        "wolf", "wolf", "monkey", "monkey", "bird", "bird"}; 

    // The  shape of the board
    private int rows = 3;
    private int columns = 4;  
        
    /**
     * Create a 2-dim array to represent a game board and return it
     *  
     * @return a game board of tiles with dimension rows x columns
     */
    public Tile[][] makeBoard() {
        return new Tile[rows][columns];
     }
    
    /**
     * Return the array of cards
     * 
     * @return a String array of card values
     * 
     */
    public String[] getCards () {   
        return cards;
    }

}
