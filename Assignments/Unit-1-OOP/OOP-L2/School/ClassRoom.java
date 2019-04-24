/**
 * The Classroom class is a ClassRoom object template
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Enfei Zhang
 * @version 19.04.24
 */

public class ClassRoom {
    String course;
    String teacher;

    /**
     * The constructor of the ClassRoom class sets the course and
     * teacher of the class
     * @param course the course of the class
     * @param teacher the teacher of the class
     */
    ClassRoom(String course, String teacher) {
        this.course = course;
        this.teacher = teacher;
    }

    /**
     * Checks if the student can enter the class
     * @param me the student trying to enter the class
     * @return false if the student can't enter and true if they can
     */
    public boolean enter(Student me) {
        if (me.myLocker == null) {
            me.sendToOffice(" does not have a locker ");
            return false;
        } else if (me.myJacket != null) {
            me.sendToOffice(" has to put their jacket in the locker ");
            return false;
        } else {
            for (Book b : me.books) {
                if (b != null && b.course.equals(course))
                    return true;
            }
            return false;
        }
    }
}

