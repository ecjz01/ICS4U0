/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is the a class that implements the PersonalInfo interface
 */

import java.util.Calendar;

public class PersonRecord implements PersonalInfo{

    private Calendar creationDate;
    private int currentAge;

    public Calendar getFileCreationDate() {
        creationDate = Calendar.getInstance();
        return creationDate;
    }

    public int getCurrentAge(int birthYear) {
        currentAge = Calendar.getInstance ().get (Calendar.YEAR) - birthYear;
        return currentAge;
    }
}
