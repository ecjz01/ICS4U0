/**
 * Enfei Zhang
 * Ms. Krasteva
 * February 12, 2018
 * This is a program that contains the default constructor and methods for Student objects
 *
 * Variable Dictionary
 * Name         Type       Purpose
 * name         String     The name of the student
 * mark1        int        The student's first mark
 * mark2        int        The student's second mark
 * average      double     The average of the students 2 marks
 */
public class Student {
    public String name;
    public int mark1;
    public int mark2;
    public double average;

    /**
     * This is the default constructor for a Student object
     * @param n The name of the student
     */
    public Student(String n) {  //
        name = n;
        mark1 = 0;
        mark2 = 0;
        average = 0.0;
    }

    /**
     * This is a method to set the marks of the student
     * @param x The students first mark
     * @param y The students second mark
     */
    public void setMarks(int x, int y) {    //Method to set the marks of the student
        mark1 = x;
        mark2 = y;
    }

    /**
     * This method calculates the average of the students 2 marks
     */
    public void calcAverage() { //Method to calculate the average of the Student
        average = (mark1 + mark2) / 2.0;
    }

    /**
     * This is a method that returns the user's average
     * @return  returns a message saying the students name and what their average was
     */
    public String message() {
        return name + " You got an " + average;
    }
} // Exercise1.Student class