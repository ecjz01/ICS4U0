/**
 * The Jacket class is a Jacket object template
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Enfei Zhang
 * @version 19.04.23
 */

public class Jacket {
    Student owner;

    /**
     * This is the constructor for a jacket object which sets the owner
     * @param me the owner of the jacket
     */
    Jacket (Student me){
        owner = me;
    }

    /**
     * This method changes what is printed when you print a jacket object
     * @return returns the owner of the jacket
     */
    public String toString(){
        return owner.toString();
    }
}
