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
		Card tenOfSpades = new Card ("Ten", "Spades", 10);
		Card kingOfHearts = new Card("King", "Heart", 13);
		Card aceOfClubs = new Card("Ace", "Clubs", 1);
		Card tenOfSpades2 = new Card("Ten", "Spades", 10);
		tenOfSpades.suit();
		System.out.println(kingOfHearts.matches(tenOfSpades2));
		System.out.println(aceOfClubs.toString());
	}
}
