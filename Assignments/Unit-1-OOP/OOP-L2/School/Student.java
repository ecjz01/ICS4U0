/**
 * The Student class is a student object template
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Enfei Zhang
 * @version 19.04.24
 */

public class Student {
    String number;
    String name;
    Locker myLocker;
    Jacket myJacket;
    Book books[];

    /**
     * The constructor for Student objects sets their name, gives
     * them a locker, jacket and an empty array of books
     * @param name the name of the student
     */
    Student(String name){
        this.name = name;
        myJacket = new Jacket(this);
        myLocker = new Locker(this);
        number = Integer.toString(myLocker.number);
        books = new Book[4];
    }

    /**
     * Sends a student to the office with a reason
     * @param reason the reason the student was sent to the office
     */
    public void sendToOffice(String reason){
        System.out.println(name + " was sent to the office because he/she" + reason);
    }

    /**
     * Changes what is printed if you print a Student object to their name
     * @return what is printed if you print a Student object
     */
    public String toString(){
        return name;
    }
}
