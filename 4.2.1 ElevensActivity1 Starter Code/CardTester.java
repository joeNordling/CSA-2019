/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card ("A", "spades", 11);
		Card c2 = new Card ("4", "diamonds", 4);
		Card c3 = new Card ("Q", "hearts", 10);
		
		c1.makeCard();
		System.out.print(c1.toString());	
		
	}
}
