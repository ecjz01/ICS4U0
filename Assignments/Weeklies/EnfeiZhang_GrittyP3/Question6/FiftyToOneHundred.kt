/*Enfei Zhang
  March 18, 2018
  Ms. Krasteva
  This is a program that will return a number between 50 and 100
 */

object FiftyToOneHundred {
    @JvmStatic
    fun main(args: Array<String>) {
        println(Math.random() * 51 + 50)  //Outputs a double
        println((Math.random() * 51).toInt() + 50) //Outputs an integer
    }
}
