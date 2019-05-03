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
		Card tenOfSpades = new Card ("Ten", "Spades", 11);
		Card kingOfHearts = new Card("King", "Heart", 17);
		Card aceOfClubs = new Card("Ace", "Clubs", 17);
		tenOfSpades.suit();
		kingOfHearts.matches(aceOfClubs);
		System.out.println(aceOfClubs.toString());
	}
}
