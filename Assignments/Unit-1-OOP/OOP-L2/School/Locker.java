/**
 * The Lcoker class is a locker object template
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Enfei Zhang
 * @version 19.04.24
 */

public class Locker {
    int number;
    Student owner;
    private Jacket studentJacket;
    private Book books[];

    /**
     * The constructor of a locker which sets its number, owner and textbooks
     *
     * @param me the owner of the locker
     */
    Locker(Student me) {
        owner = me;
        number = (int) Math.random() * 2000 + 1;
        books = new Book[4];
        studentJacket = null;

        Book mathTextbook = new Book();
        Book scienceTextbook = new Book();
        Book historyTextbook = new Book();
        Book geographyTextbook = new Book();

        mathTextbook.setCourse("MPM 2D3");
        scienceTextbook.setCourse("SNC 2D3");
        historyTextbook.setCourse("CDC 2D1");
        geographyTextbook.setCourse("CGC 1D3");

        mathTextbook.setTitle("Principles of Mathematics");
        scienceTextbook.setTitle("Nelson's Science Textbook");
        historyTextbook.setTitle("Canadian History");
        geographyTextbook.setTitle("Canadian Geography");
    }

    /**
     * Gets a book from the locker and puts it on the student
     *
     * @param course the course of the book
     * @return the book
     */
    public Book getABook(String course) {
        for (int x = 0; x < books.length; x++) {
            Book b = books[x];
            if (b != null && b.course.equals(course)) {
                for (int y = 0; y < owner.books.length; y++) {
                    if (owner.books[y] == null) {
                        owner.books[y] = b;
                        books[x] = null;
                        return b;
                    }
                }
            }
        }
        throw new IllegalArgumentException("There is no such book in your locker!");
    }

    /**
     * Puts a book into the locker
     *
     * @param book the book being put into the locker
     */
    public void putABook(Book book) {
        boolean success = false;
        for (int x = 0; x < books.length; x++) {
            if (books[x] == null) {
                for (int y = 0; x < owner.books.length; y++) {
                    if (owner.books[y] == book) {
                        owner.books[y] = null;
                        success = true;
                        break;
                    }
                }
                books[x] = book;
                success = true;
                break;
            }
        }
        if (!success)
            throw new IllegalArgumentException("There is no space in your locker!");
    }

    /**
     * The getJacket method returns the jacket in the locker and takes it out of the locker
     *
     * @return returns the current jacket in the locker or null if there is none
     */
    public Jacket getJacket() {
        Jacket tempJacket = studentJacket;
        studentJacket = null;
        if (tempJacket != null) {
            owner.myJacket = tempJacket;
            return tempJacket;
        } else
            return null;
    }

    /**
     * Checks if there is a jacket in the locker and which jacket it is.
     *
     * @return returns the jacket
     */
    public Jacket checkJacket() {
        return studentJacket;
    }

    /**
     * Puts a jacket into the locker
     * @param thisJacket the jacket
     */
    public void putJacket(Jacket thisJacket) {
        if (studentJacket == null && thisJacket.owner.myJacket != null) {
            thisJacket.owner.myJacket = null;
            studentJacket = thisJacket;
        }
        else
            throw new IllegalArgumentException("There is already a jacket in the locker!");
    }

    /**
     * Changes what is printed when you print a locker object
     *
     * @return what is printed when you print a locker object
     */
    public String toString() {
        return number + " belongs to " + owner.toString();
    }
}
