public class Book {
    String title;
    String course;

    Book() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString() {
        return title + " " + course;
    }
}
