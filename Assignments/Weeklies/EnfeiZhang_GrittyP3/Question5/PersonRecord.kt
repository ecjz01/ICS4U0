/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is the a class that implements the PersonalInfo interface
 */

import java.util.Calendar

class PersonRecord : PersonalInfo {

    private var creationDate: Calendar? = null
    private var currentAge: Int = 0

    override val fileCreationDate: Calendar?
        get() {
            creationDate = Calendar.getInstance()
            return creationDate
        }

    override fun getCurrentAge(birthYear: Int): Int {
        currentAge = Calendar.getInstance().get(Calendar.YEAR) - birthYear
        return currentAge
    }
}
