/**
 * The DeckofCards class is a DeckofCards object template
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Enfei Zhang
 * @version 19.04.24
 */

public class DeckofCards {
    private Card myDeck[];
    private int myCardNum = 0;


    public DeckofCards() {
        String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        myDeck = new Card[52];
        //
        for (int n = 0; n < 52; n++) {
            myDeck[n] = new Card(faces[n % 13], suits[n / 13]);
        }
    }

    public Card deal() {
        if (myCardNum < 52)
            return myDeck[myCardNum++];
        else
            return null;
    }

    public void shuffle() {
        for (int x = 0; x < myDeck.length; x++){
            Card tempCard = myDeck[x];
            int swap = (int) Math.random() * (myDeck.length - 1);
            myDeck[x] = myDeck[swap];
            myDeck[swap] = tempCard;
        }
    }
}











