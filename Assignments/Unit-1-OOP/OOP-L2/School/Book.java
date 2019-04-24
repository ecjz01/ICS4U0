/**
 * The Book class is a Book object template
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Enfei Zhang
 * @version 19.04.24
 */

public class Book {
    String title;
    String course;

    /**
     * Sets the title of the book
     * @param title the title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets tge course of the book
     * @param course the course of the book
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * This changes what is printed when you print a book
     * @return returns the title and course of the book
     */
    public String toString() {
        return title + " " + course;
    }
}
