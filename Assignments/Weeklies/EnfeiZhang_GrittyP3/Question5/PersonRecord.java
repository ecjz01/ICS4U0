
import java.util.Calendar;

public class PersonRecord implements PersonalInfo{

    private Calendar creationDate;
    private int currentAge;

    @Override
    public Calendar getFileCreationDate() {
        creationDate = Calendar.getInstance();
        return creationDate;
    }

    @Override
    public int getCurrentAge(int birthYear) {
        currentAge = Calendar.getInstance ().get (Calendar.YEAR) - birthYear;
        return currentAge;
    }
}
