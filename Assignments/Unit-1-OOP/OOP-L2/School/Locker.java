/**
 * The Lcoker class is a locker object template
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Enfei Zhang
 * @version 19.04.23
 */

public class Locker {
    int number;
    Student owner;
    private Jacket studentJacket;
    private Book books[];

    /**
     * The constructor of a locker which sets its number, owner and textbooks
     * @param me the owner of the locker
     */
    Locker(Student me) {
        owner = me;
        number = (int) Math.random() * 2000 + 1;
        books = new Book[4];

        Book mathTextbook = new Book();
        Book scienceTextbook = new Book();
        Book historyTextbook = new Book();
        Book geographyTextbook = new Book();

        mathTextbook.setCourse("MPM 2D3");
        scienceTextbook.setCourse("SNC 2D3");
        historyTextbook.setCourse("CDC 2D1");
        geographyTextbook.setCourse("CGC 1D 3");
    }

    /**
     * Gets a book from the locker and puts it on the student
     * @param course the course of the book
     * @return the book
     */
    public Book getABook(String course) {
        for (int x = 0; x < books.length; x++) {
            Book b = books[x];
            if (b.course.equals(course)) {
                for (int y = 0; y < owner.books.length; y++) {
                    if (owner.books[y] == null) {
                        owner.books[y] = b;
                        books[x] = null;
                        return b;
                    }
                }
            }
        }
        return null;
    }

    /**
     * Puts a book into the locker
     * @param book the book being put into the locker
     */
    public void putABook(Book book) {

        for (int j = 0; j < owner.books.length; j++) {
            Book b = owner.books[j];
            if (b.equals(book)) {
                for (int i = 0; i < books.length; i++) {
                    if (books[i] == null) {
                        books[i] = b;
                        owner.books[j] = null;
                    }
                }
            }
        }

        for (int x = 0; x < books.length; x++){
            if (books[x] != null){
                books[x] = book;
                break;
            }
        }
    }

    public Jacket getJacket() {
        Jacket tempJacket = studentJacket;
        if (studentJacket != null){
            studentJacket = null;
            owner.myJacket = tempJacket;
            return tempJacket;
        }
        else
            throw new IllegalArgumentException("There is no Jacket to take out");
    }

    public Jacket checkJacket() {
        return studentJacket;
    }

    public void putJacket(Jacket thisJacket) {
        studentJacket = thisJacket;
        owner.myJacket = null;
    }

    public String toString() {
        return number + " belongs to " + owner.toString();
    }
}
