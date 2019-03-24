/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is the an interface for personal info.
 */

import java.util.Calendar;

interface PersonalInfo {
    Calendar getFileCreationDate();
    int getCurrentAge(int birthYear);
}
