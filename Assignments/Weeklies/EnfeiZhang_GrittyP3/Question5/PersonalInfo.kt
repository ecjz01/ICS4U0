/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is the an interface for personal info.
 */

import java.util.Calendar

internal interface PersonalInfo {
    val fileCreationDate: Calendar
    fun getCurrentAge(birthYear: Int): Int
}
