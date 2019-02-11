package Exercise1;

public class Student {
    public String name;
    public int mark1;
    public int mark2;
    public double average;

    public Student(String n) {  //
        name = n;
        mark1 = 0;
        mark2 = 0;
        average = 0.0;
    }

    public void setMarks(int x, int y) {    //Method to set the marks of the student
        mark1 = x;
        mark2 = y;
    }

    public void calcAverage() { //Method to calculate the average of the Student
        average = (mark1 + mark2) / 2.0;
    }

    public String message() {
        return name + "You got an " + average;
    }
} // Exercise1.Student class