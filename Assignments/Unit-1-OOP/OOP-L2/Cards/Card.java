// Conlon
// Card object
// Deck of cards "has a" card


import java.util.Arrays;

public class Card {

    String myFace;

    String mySuit;


    public Card(String theFace, String theSuit) {

        myFace = theFace;

        mySuit = theSuit;

    }


    public String toString() {

        return myFace + " of " + mySuit;
    }

} // close class











