/**
 * The Student class is a student object template
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Enfei Zhang
 * @version 19.04.23
 */

public class Student {
    String number;
    String name;
    Locker myLocker;
    Jacket myJacket;
    Book books[];

    Student(String name){
        this.name = name;
        myJacket = new Jacket(this);
        myLocker = new Locker(this);
        number = Integer.toString(myLocker.number);
        books = new Book[4];
    }

    public void sendToOffice(String reason){
        System.out.println(name + "was sent to the office because he/she" + reason);
    }

    public String toString(){
        return name;
    }
}
