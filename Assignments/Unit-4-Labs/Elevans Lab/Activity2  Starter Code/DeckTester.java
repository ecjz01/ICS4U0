/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] deck1Ranks = {"King", "Ace", "Four", "Ten", "Two", "Jack", "Queen"};
		String[] deck1Suits = {"Spade", "Heart", "Club", "Diamond", "Spade", "Spade", "Heart"};
		int[] deck1Values = {13, 1, 4, 10, 2, 11, 12};
		Deck deck1 = new Deck(deck1Ranks, deck1Suits, deck1Values);

		String[] deck2Ranks = {"Seven", "King", "Queen", "Five", "Ace", "Jack", "Eight"};
		String[] deck2Suits = {"Spade", "Heart", "Club", "Diamond", "Spade", "Spade", "Diamond"};
		int[] deck2Values = {7, 13, 12, 5, 1, 11, 8};
		Deck deck2 = new Deck(deck2Ranks, deck2Suits, deck2Values);

		String[] deck3Ranks = new String[0];
		String[] deck3Suits = new String[0];
		int[] deck3Values = new int[0];
		Deck deck3 = new Deck(deck3Ranks, deck3Suits, deck3Values);

		System.out.println(deck1.isEmpty());
		System.out.println(deck2.isEmpty());
		System.out.println(deck3.isEmpty());

		System.out.println(deck1.size());
		System.out.println(deck2.size());
		System.out.println(deck3.size());

		System.out.println(deck1.deal());
		System.out.println(deck2.deal());
		System.out.println(deck3.deal());

		System.out.println(deck1);
		System.out.println(deck2);
		System.out.println(deck3);
	}
}
